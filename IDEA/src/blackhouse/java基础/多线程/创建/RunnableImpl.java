package blackhouse.java基础.多线程.创建;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " --->" + i);
        }
    }
}
