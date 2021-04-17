package 考试.每日一题.day04;

import java.util.Scanner;

public class 计算糖果 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double AsubB = in.nextInt();
        double BsubC = in.nextInt();
        double AaddB = in.nextInt();
        double BaddC = in.nextInt();
        double A, B1, B2, C;
        A = (AsubB + AaddB) / 2.0;
        B1 = (BsubC + BaddC) / 2.0;
        B2 = (AaddB - AsubB) / 2.0;
        C = BaddC - B1;
        if (-30 <= A && A <= 30 && -30 <= B1 && B1 <= 30 && -30 <= C && C <= 30 && (B1 == B2)) {
            System.out.println((int) A + " " + (int) B1 + " " + (int) C);
        } else {
            System.out.println("No");
        }

    }
}
