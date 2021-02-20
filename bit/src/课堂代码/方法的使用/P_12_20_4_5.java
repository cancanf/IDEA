package 课堂代码.方法的使用;

import java.util.Scanner;

public class P_12_20_4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(jiecheng(in.nextInt()));
    }

    private static long jiecheng(int nextInt) {
        long temp = 1;
        for (int i = 1; i <= nextInt; i++) {
            temp *= i;
        }
        return temp;
    }
}
