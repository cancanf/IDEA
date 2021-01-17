package 天梯赛2020;

import java.util.Scanner;

public class L1_2 {
    public static void main(String[] args) {
        double a;
        int b;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextInt();
        System.out.printf("%.2f", a * b / 10);
    }
}
