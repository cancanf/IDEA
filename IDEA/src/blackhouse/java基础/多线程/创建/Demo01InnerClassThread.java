package blackhouse.java基础.多线程.创建;

public class Demo01InnerClassThread {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i);
                }
            }
        }.start();
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + "asfd");
                }
            }
        };
        new Thread(r).start();
    }
}
