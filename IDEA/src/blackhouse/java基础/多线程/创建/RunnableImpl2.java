package blackhouse.java基础.多线程.创建;

public class RunnableImpl2 implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("hollwworld" + i);
        }
    }
}
