package 考试.每日一题.day18;

import java.util.Scanner;

public class tuzi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int[] fib = new int[4];
            fib[0] = 1;
            fib[1] = 1;
            int n = in.nextInt();
            if (n <= 2) {
                System.out.println(1);
            } else {
                for (int i = 2; i < n; i++) {
                    int temp = fib[2] = fib[1] + fib[0];
                    fib[0] = fib[1];
                    fib[1] = temp;
                }
                System.out.println(fib[2]);
            }
        }
    }
}
