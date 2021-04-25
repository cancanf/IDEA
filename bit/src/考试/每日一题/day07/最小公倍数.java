package 考试.每日一题.day07;

import java.util.Scanner;

public class 最小公倍数 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt(), B = in.nextInt();
        int min = Math.min(A, B);
        int max = Math.max(A, B);
        if (max % min == 0) {
            System.out.println(max);
        } else {
            for (; min % max != 0; ) {
                min += A;
            }
            System.out.println(min);
        }
    }

}
