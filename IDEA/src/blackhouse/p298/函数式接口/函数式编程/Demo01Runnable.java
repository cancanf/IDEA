package blackhouse.p298.函数式接口.函数式编程;

public class Demo01Runnable {

    public static void startThread(Runnable run) {
        new Thread(run).start();
    }

    public static void main(String[] args) {
        //匿名内部类写法
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->" + "线程启动了");
            }
        });
        //因为方法的参数是一个函数式接口,所以可以用lambda表达式写法
        startThread(() -> {
            System.out.println(Thread.currentThread().getName() + "-->" + "线程启动了");
        });
        //优化
        startThread(() -> System.out.println(Thread.currentThread().getName() + "-->" + "线程启动了"));

    }
}
