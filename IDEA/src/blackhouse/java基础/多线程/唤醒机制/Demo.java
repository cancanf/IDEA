package blackhouse.java基础.多线程.唤醒机制;

public class Demo {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new Chi(bz).start();
    }
}
