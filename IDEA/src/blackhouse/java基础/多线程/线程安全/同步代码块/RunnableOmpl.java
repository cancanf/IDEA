package blackhouse.java基础.多线程.线程安全.同步代码块;

public class RunnableOmpl implements Runnable {

    private int ticket = 100;
    Object obj = new Object();

    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket > 0) {

                    System.out.println(Thread.currentThread().getName() + "->>>>" + "正在卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
