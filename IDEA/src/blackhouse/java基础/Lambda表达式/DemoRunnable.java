package blackhouse.java基础.Lambda表达式;

public class DemoRunnable {
    public static void main(String[] args) {
        //创建RUN你罢了接口的实现对象
        Runnable run = new RunnableImpl();
        //创建Thread类对象,构造方法传递Runnable接口实现类
        Thread t = new Thread(run);
        //开启新线程
        t.start();

        //简化代码,使用匿名内部类

        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程");
            }
        }).start();

    }
}
