package 考试.每日一题.day29;

import java.util.Scanner;

public class 假币 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long i = in.nextLong();
            if (i == 0) {
                break;
            }
            int ci = 0;
            while (i > 1) {
                if (i % 3 == 0) {
                    i /= 3;
                } else if (i % 3 == 1) {
                    i = i / 3 + 1;
                } else {
                    i = i / 3 + 1;
                }
                ci++;
            }
            System.out.println(ci);
        }
    }
}
