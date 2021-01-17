package blackhouse.java基础.多线程.创建;

public class MyThread extends Thread {

    public void run() {
        String name = getName();
        System.out.println(name);

        Thread t = Thread.currentThread();
        System.out.println(t);

        System.out.println(t.getName());
    }
}
