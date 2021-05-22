gameInfo = {
    userId: myUserId,
    roomId: null,
    isWhite: true,
    otherUserId: null,
}

function onClick(userId) {
    startMatch(userId);
    $("#matchButton").attr("disabled", true);

    $("#matchButton").text("匹配中...");
}

function hideMatchButton() {
    $("#matchButton").hide();
}

function setScreenText(me) {
    if (me) {
        $("#screen").text("轮到你落子了!")
    } else {
        $("#screen").text("轮到对方落子了!")
    }
}

//////////////////////////////////////////////////
// 初始化 websocket
//////////////////////////////////////////////////
var websocket = new WebSocket('ws://127.0.0.1:8080/java42_chess/game/' + gameInfo.userId);

websocket.onopen = function () {
    console.log("建立连接!");
}

websocket.onclose = function () {
    console.log("断开连接!");
}

websocket.onerror = function () {
    console.log("连接异常!");
}

// 一会要在不同的流程中进行不同的处理
// 匹配流程和落子流程处理方式不一样
// websocket.onmessage = function (event) {
//
// }

// DOM API 前端程序猿要非常熟悉. 后端不需要
window.onbeforeunload = function () {
    // 页面关闭之前, 先主动关闭 websocket
    websocket.close();
}

//点击匹配按钮的点击回调
function startMatch(userId) {
    var message = {
        type: "startMatch",
        userId: userId
    };
    websocket.onmessage = handlerStartMatch;

    websocket.send(JSON.stringify(message));
}

function handlerStartMatch(event) {
    //将服务器响应转为JSON对象
    console.log("handlerStartMatch: " + event.data);
    var response = JSON.parse(event.data);

    if (response.type != 'startMatch') {
        console.log("handlerStartMatch: 无效的响应! type: " + response.type);
        return;
    }

    // 2.从响应中得到了一些信息,房间id和是否先手
    gameInfo.isWhite = response.isWhite;
    gameInfo.roomId = response.roomId;
    gameInfo.otherUserId = response.otherUserId;

    //隐藏匹配按钮
    hideMatchButton();
    //提示信息提示当前谁的回合
    setScreenText(gameInfo.isWhite);

    //初始化棋盘
    initGame();
}

//////////////////////////////////////////////////
// 匹配成功, 则初始化一局游戏
//////////////////////////////////////////////////
function initGame() {
    // 是我下还是对方下. 根据服务器分配的先后手情况决定
    var me = gameInfo.isWhite;
    // 游戏是否结束
    var over = false;
    var chessBoard = [];
    //初始化chessBord数组(表示棋盘的数组)
    for (var i = 0; i < 15; i++) {
        chessBoard[i] = [];
        for (var j = 0; j < 15; j++) {
            chessBoard[i][j] = 0;
        }
    }
    var chess = document.getElementById('chess');
    var context = chess.getContext('2d');
    context.strokeStyle = "#BFBFBF";
    // 背景图片
    var logo = new Image();
    logo.src = "images/sky.jpeg";
    logo.onload = function () {
        context.drawImage(logo, 0, 0, 450, 450);
        initChessBoard();
    }

    // 绘制棋盘网格
    function initChessBoard() {
        for (var i = 0; i < 15; i++) {
            context.moveTo(15 + i * 30, 15);
            context.lineTo(15 + i * 30, 430);
            context.stroke();
            context.moveTo(15, 15 + i * 30);
            context.lineTo(435, 15 + i * 30);
            context.stroke();
        }
    }

    // 绘制一个棋子, me 为 true
    // i 表示列, j 表示行
    function oneStep(i, j, isWhite) {
        context.beginPath();
        context.arc(15 + i * 30, 15 + j * 30, 13, 0, 2 * Math.PI);
        context.closePath();
        var gradient = context.createRadialGradient(15 + i * 30 + 2, 15 + j * 30 - 2, 13, 15 + i * 30 + 2, 15 + j * 30 - 2, 0);
        if (!isWhite) {
            gradient.addColorStop(0, "#0A0A0A");
            gradient.addColorStop(1, "#636766");
        } else {
            gradient.addColorStop(0, "#D1D1D1");
            gradient.addColorStop(1, "#F9F9F9");
        }
        context.fillStyle = gradient;
        context.fill();
    }

    chess.onclick = function (e) {
        if (over) {
            return;
        }
        if (!me) {
            return;
        }
        var x = e.offsetX;
        var y = e.offsetY;
        // 注意, 横坐标是列, 纵坐标是行
        var col = Math.floor(x / 30);
        var row = Math.floor(y / 30);
        if (chessBoard[row][col] == 0) {
            // TODO 新增发送数据给服务器的逻辑
            send(row, col);

            // oneStep(col, row, gameInfo.isWhite);
            // chessBoard[row][col] = 1;
            // 通过这个语句控制落子轮次
            // me = !me;
        }
    }

}

