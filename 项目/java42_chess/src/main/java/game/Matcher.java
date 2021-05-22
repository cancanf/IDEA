package game;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.websocket.Session;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

//进行匹配逻辑实现的类
//也是使用单例模式
public class Matcher {
    private Gson gson = new GsonBuilder().create();
    private BlockingQueue<Request> matchQueue = new LinkedBlockingQueue<>();
    //添加匹配队列
    public void addMatchQueue(Request request) throws InterruptedException {
        //带有阻塞功能
        matchQueue.put(request);
    }
    //进行匹配
    private void handlerMatch() throws InterruptedException, IOException {
        //take方法带有阻塞功能
        Request player1 = matchQueue.take();
        Request player2 = matchQueue.take();
        System.out.println("匹配到两个玩家: " + player1.getUserId() +"he"+ player2.getUserId());
        //根据id进行检查玩家的在线状态

        Session session1 = OnlineUserManager. getInstance().getSession(player1.getUserId());
        Session session2 = OnlineUserManager.getInstance().getSession(player2.getUserId());
        //玩家1掉线
        if(session1 == null){
            matchQueue.put(player2);
            return;
        }
        //玩家1掉线
        if(session2 == null){
            matchQueue.put(player1);
            return;
        }
        //无人掉线
        //将两个玩家放入房间
        Room room = new Room();
        room.setUserId1(player1.getUserId());
        room.setUserId2(player2.getUserId());
        RoomManager.getInstance().addRoom(room);

        //然后向两个玩家反馈匹配成功的消息
        MatcherResponse response1 = new MatcherResponse();
        response1.setRoomId(room.getRoomId());
        response1.setWhite(true);
        response1.setOtherUserId(player2.getUserId());
        String respString1 = gson.toJson(response1);
        session1.getBasicRemote().sendText(respString1);

        MatcherResponse response2 = new MatcherResponse();
        response2.setRoomId(room.getRoomId());
        response2.setWhite(false);
        response2.setOtherUserId(player1.getUserId());
        String respString2 = gson.toJson(response2);
        session2.getBasicRemote().sendText(respString2);

    }

//单例模式的实现1.构造方法设为私有private
// 2.用时static保证这个实例引用的new操作只被进行一次
// 3.写getInstance方法
    private Matcher() {
        //在构造方法里新建一个线程用于扫描队列进行匹配
        Thread t = new Thread() {
            @Override
            public void run() {
                // 线程的入口方法.
                // 这个扫描队列的过程是自始至终的.
                // 只要服务器正在运行, 就可能有客户端发来匹配请求
                // 就需要持续不断的进行处理
                while (true) {
                    // 通过这个方法来实现 "一次匹配" 的过程
                    try {
                        handlerMatch();
                    } catch (InterruptedException | IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        // 真正启动线程
        t.start();
    }
    private static Matcher matcher = new Matcher();
    public static Matcher getInstance() {
        return matcher;
    }
}
