package blue.PTA.选拔赛前热身;

import java.util.Scanner;

public class A乘以B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m;
        n = in.nextInt();
        m = in.nextInt();
        if (m < 0) {
            System.out.print(n + "/(" + m + ")=");
            System.out.printf("%.2f", (double) n / m);
        } else if (m == 0) {
            System.out.println(n + "/" + m + "=Error");
        } else {
            System.out.print(n + "/" + m + "=");
            System.out.printf("%.2f", (double) n / m);
        }
    }
}
