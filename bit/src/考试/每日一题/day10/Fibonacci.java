package 考试.每日一题.day10;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] f = new int[3];
            f[0] = 0;
            f[1] = 1;
            while (true) {
                if (f[1] >= n && n >= f[0]) {
                    System.out.println(Math.min(f[1] - n, n - f[0]));
                    return;
                }
                f[2] = f[1] + f[0];
                f[0] = f[1];
                f[1] = f[2];
            }
        }
    }
}
