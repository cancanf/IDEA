package 考试.每日一题.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    int a;

    public Test(int a) {
        this.a = a;
    }

    public Test() {
        this(1);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(2);
            }
        });

    }
}
