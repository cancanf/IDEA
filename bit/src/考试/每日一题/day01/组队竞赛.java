package 考试.每日一题.day01;

import java.util.Arrays;
import java.util.Scanner;

public class 组队竞赛 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            long[] ints = new long[3 * n];
            for (int i = 0; i < 3 * n; i++) {
                ints[i] = in.nextLong();
            }
            Arrays.sort(ints);
            int i = 0, j = 3 * n - 1;
            long sum = 0;
            while (i < j) {
                i++;
                j--;
                sum += ints[j];
                j--;
            }
            System.out.println(sum);
        }
    }

}
