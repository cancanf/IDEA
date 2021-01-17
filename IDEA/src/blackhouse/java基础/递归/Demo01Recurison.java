package blackhouse.java基础.递归;

import java.util.Scanner;

public class Demo01Recurison {
    static int sum = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        b(n);
    }

    private static void b(int n) {

        if (n == 0) {
            System.out.println(sum);
            return;
        } else {
            sum += n;
            n--;
            b(n);
        }

    }
}
