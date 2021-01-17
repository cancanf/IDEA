package blackhouse.java基础.多线程.线程安全.安全问题的产生;

public class RunnableOmpl implements Runnable {

    private int ticket = 100;

    public void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "->>>>" + "正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
