package 考试.每日一题.day13;

public class Test {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                dianping();
            }
        };
        t.run();
        System.out.println("fff");
    }

    static void dianping() {
        System.out.println("dianf");
    }
}
