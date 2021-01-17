package blue.PTA.选拔赛前热身;

import java.util.Scanner;

public class 计算指数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("2^" + n + " = " + (int) Math.pow(2, n));
    }
}
