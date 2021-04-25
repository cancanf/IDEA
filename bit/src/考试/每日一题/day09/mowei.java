package 考试.每日一题.day09;

import java.util.Scanner;

public class mowei {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int sum = 0;
            if (n < 5) {
                System.out.println(0);
            } else {
                for (int i = 5; i <= n; i++) {
                    int k = i;
                    while (k % 5 == 0) {
                        sum++;
                        k = k / 5;
                    }
                }
                System.out.print(sum);
            }
            System.out.println();
        }
    }
}