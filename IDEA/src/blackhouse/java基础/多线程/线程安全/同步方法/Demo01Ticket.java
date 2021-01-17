package blackhouse.java基础.多线程.线程安全.同步方法;

public class Demo01Ticket {

    public static void main(String[] args) {
        RunnableOmpl run = new RunnableOmpl();
        System.out.println("run + " + run);//run对象的地址
        Thread t0 = new Thread(run);//三个参数都为run对象保证数据为同一份
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();
    }
}
