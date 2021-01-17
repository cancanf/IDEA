package blackhouse.java基础.多线程.改变线程名称;

public class Demo01SetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("123");
        mt.start();
        //第二种改变方法名称
        new MyThread("wd").start();
    }
}
