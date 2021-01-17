package blackhouse.java基础.多线程.线程安全.同步方法;

public class RunnableOmpl implements Runnable {

    private static int ticket = 100;

    public void run() {
        System.out.println("this + " + this);//本类的地址

        while (true) {
            //  payTicket();
            //     payTicketstatic();
        }
    }

    public static synchronized void payTicketstatic() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "->>>>" + "正在卖第" + ticket + "张票");
            ticket--;
        }
    }

    public synchronized void payTicket() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "->>>>" + "正在卖第" + ticket + "张票");
            ticket--;
        }
    }
}
