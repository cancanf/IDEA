package game;

import javax.websocket.Session;
import java.util.concurrent.ConcurrentHashMap;

// 通过这个类来管理用户的在线状态
// 为了管理这个服务器上所有的用户, 其实只要有这么一份 hashMap 就可以了.
// 像现在这个代码里面, 如果我们 new 了多个 OnlineUserManager 实例, 其实就
// 相当于搞出了多份这样的 hash 表~~
// 我们希望 OnlineUserManager 这样的类只能有唯一的一个实例!!
// "单例模式"
public class OnlineUserManager {
    //因为多人链接同时访问服务器进行建立和断开连接操作
    //就会有多个线程同时操作HashMap,会产生线程安全问题
    //因此我们需要使用ConcurrentHashMap
    //Concurrent 英文原义 "并发"
    private ConcurrentHashMap<Integer, Session> users = new ConcurrentHashMap<>();

    public void online(int userId, Session session) {
        users.put(userId, session);
    }

    public void offline(int userId) {
        users.remove(userId);
    }

    public Session getSession(int userId) {
        return users.get(userId);
    }

    // "单例模式"
    //将构造方法设置为私有,在外界就不能创建实例
    private OnlineUserManager() {
    }

    private static OnlineUserManager onlineUserManager = new OnlineUserManager();
    //想要使用这唯一的实例对象,就只能使用getInstance()这个方法进行获取
    public static OnlineUserManager getInstance() {
        return onlineUserManager;
    }


}
