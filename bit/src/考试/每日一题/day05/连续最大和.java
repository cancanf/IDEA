package 考试.每日一题.day05;

import java.util.Scanner;

public class 连续最大和 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] sum = new int[n];
            long max;
            long total;
            for (int i = 0; i < n; i++) {
                sum[i] = in.nextInt();
            }
            max = sum[0];
            total = 0;
            for (int i = 0; i < n; i++) {
                total += sum[i];
                if (total > max) {
                    max = total;
                }
                if (total < 0) {
                    total = 0;
                }
            }
            System.out.println(max);
        }
    }
}
