package game;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

//和前端进行交互
@ServerEndpoint("/game/{userId}")
public class GameAPI {
    private int userId;
    private Gson gson = new GsonBuilder().create();
    @OnOpen
    public void onOpen(@PathParam("userId") String userId, Session session) throws IOException {
        System.out.println("链接建立 userId : " + userId);
        this.userId = Integer.parseInt(userId);
        if(OnlineUserManager.getInstance().getSession(this.userId) == null){
            OnlineUserManager.getInstance().online(this.userId,session);
        }else {
            session.getBasicRemote().sendText("duplicationLogin");
        }
    }

    @OnClose
    public void onClose() {
        System.out.println("连接关闭! userId: " + this.userId);
    }

    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("连接异常! userId: " + this.userId);
        error.printStackTrace();
    }
    @OnMessage
    public void onMessage(String message, Session session) throws InterruptedException {
        System.out.println("收到消息! message: " + message + ", userId: " + userId);
//        session.getBasicRemote().sendText();
        Request request = gson.fromJson(message, Request.class);
        if("startMatch".equals(request.getType())){
            //匹配请求
            Matcher.getInstance().addMatchQueue(request);
        }else if("putChess".equals(request.getType())){
            //落子请求

        }else {
            System.out.println("请求类型错误 type = " + request.getType());
        }
    }
}
