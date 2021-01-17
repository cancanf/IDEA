package blackhouse.java基础.多线程.创建;

public class Demo01Runnable {
    public static void main(String[] args) {

        RunnableImpl run = new RunnableImpl();
        Thread t = new Thread(new RunnableImpl2());

        t.start();
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " --->" + i);
        }

    }
}
