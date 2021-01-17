package blackhouse.java基础.多线程.唤醒机制;

public class Chi extends Thread {
    private BaoZi bz;

    public Chi(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.falg == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("在吃" + bz.xian + bz.pi + "包子");
                bz.falg = false;
                bz.notify();
                System.out.println("已经吃了,继续生产");
                System.out.println("_________________________");
            }
        }

    }
}
