package 课堂代码.课后作业.方法的使用;

import java.util.Scanner;

public class P_12_20_4_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(jiecheng(in.nextInt()));
    }

    private static long jiecheng(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            long temp = 1;
            for (int j = 1; j <= i; j++) {
                temp *= j;
            }
            sum += temp;
        }
        return sum;
    }
}
