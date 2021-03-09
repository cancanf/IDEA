package 课堂代码.课后作业.递归方法的使用;

import java.util.Scanner;

public class P_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(sum(in.nextInt()));
    }

    private static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return sum(n - 1) + n;
    }
}
