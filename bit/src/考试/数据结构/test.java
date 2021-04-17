package 考试.数据结构;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        while (fib1 < N) {
            int temp = fib1;
            fib1 = fib1 + fib2;
            fib2 = temp;
        }
        int one = fib1 - N;
        int two = N - fib2;
        int sum = Math.min(one, two);
        System.out.println(sum);
    }
}
