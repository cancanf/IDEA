package 考试.每日一题.day05;


import java.util.Arrays;
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
            max = 0;
            total = 0;
            boolean ok = false;
            for (int i = 0; i < n; i++) {
                if (sum[i] >= 0) {
                    total += sum[i];
                    ok = true;
                } else {
                    if (ok && total > max) {
                        max = total;
                        total = 0;
                    }

                }
            }
            if (!ok) {
                Arrays.sort(sum);
                System.out.println(sum[sum.length - 1]);
            } else {
                System.out.println(Math.max(max, total));
            }
        }
    }
}
