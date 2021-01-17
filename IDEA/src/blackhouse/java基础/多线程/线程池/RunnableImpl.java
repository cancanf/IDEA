package blackhouse.java基础.多线程.线程池;

public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新线程");
    }
}
