package 课堂代码.递归方法的使用;

import java.util.Scanner;

public class p_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(Fibonacci(in.nextInt()));
    }

    private static long Fibonacci(int n) {//0 1 1 2 3 5 8 13
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
