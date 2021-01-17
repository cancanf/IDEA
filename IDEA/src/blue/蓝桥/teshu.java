package blue.蓝桥;

import java.util.Scanner;

public class teshu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0, f = 0, k = 0;
        long sum = 0;
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            k = i;
            while (k > 0) {
                f = k % 10;
                if (f == 2 || f == 0 || f == 1 || f == 9) {
                    sum += i;
                    break;
                }
                k = k / 10;
            }
        }
        System.out.println(sum);
    }
}
