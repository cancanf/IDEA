package game;

import java.util.UUID;

public class Room {
    private static final int MAX_ROW = 15;
    private static final int MAX_COL = 15;

    // 此处我们需要保证房间 id 的唯一性
    // 每次创建一个新的房间实例, 该房间实例都是和其他房间不重复
    // 此处我们使用 UUID 来作为房间 id, 保证每个房间的编号不重复
    private String roomId;
    // 两个对局的玩家
    private int userId1;
    private int userId2;
    // 游戏状态. 也就是棋盘上的情况
    // 约定 玩家1 的棋子用 1 表示. 玩家2 的棋子用 2 表示.
    // 未落子的空白位置, 使用 0 表示. 初始情况下棋盘里就是全 0
    private int[][] chessBoard = new int[MAX_ROW][MAX_COL];

    public Room() {
        this.roomId = UUID.randomUUID().toString();
    }

    public int getUserId1() {
        return userId1;
    }

    public void setUserId1(int userId1) {
        this.userId1 = userId1;
    }

    public int getUserId2() {
        return userId2;
    }

    public void setUserId2(int userId2) {
        this.userId2 = userId2;
    }

    public String getRoomId() {
        return roomId;
    }

}
