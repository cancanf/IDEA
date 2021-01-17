package blackhouse.java基础.多线程.Lock;

import java.util.concurrent.locks.ReentrantLock;

public class RunnableOmpl implements Runnable {
    ReentrantLock lock = new ReentrantLock();
    private int ticket = 100;

    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "->>>>" + "正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
