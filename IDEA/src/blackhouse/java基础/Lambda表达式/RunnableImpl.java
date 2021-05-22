package blackhouse.java基础.Lambda表达式;

public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新线程");
    }
}
