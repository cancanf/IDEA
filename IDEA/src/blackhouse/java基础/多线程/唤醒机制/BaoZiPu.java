package blackhouse.java基础.多线程.唤醒机制;

public class BaoZiPu extends Thread {
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                if (bz.falg) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count == 0) {
                    bz.pi = "薄皮";
                    bz.xian = "三鲜";
                } else {
                    bz.pi = "2";
                    bz.xian = "2";
                }
                count++;
                System.out.println("在生产" + bz.pi + bz.xian + "包子");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.falg = true;
                bz.notify();
                System.out.println("生产好了" + bz.pi + bz.xian + "包子");
            }

        }
    }
}
