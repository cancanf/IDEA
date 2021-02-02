package 课堂代码.递归方法的使用;

import java.util.Scanner;

public class P_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(sum(in.nextInt()));

    }

    private static int sum(int n) {//1 + 4 + 2 + 7
        if (n == 0) {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }
}
