package blackhouse.java基础.多线程.创建;

public class Demo01Thread {

    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.start();
//        MyThread mt2 = new MyThread();
//        mt2.start();
//        MyThread mt3 = new MyThread();
//        mt3.start();

        System.out.println(Thread.currentThread().getName());


    }

}
