package 天梯赛2020;


import java.util.Scanner;

public class L1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        for (int i = 0; i < b / 2; i++) {
            a = a * 2;
        }
        b = b % 2;
        System.out.println(b + " " + a);
    }
}
