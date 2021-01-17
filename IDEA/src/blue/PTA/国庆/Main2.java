package blue.PTA.国庆;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, sum = 0;
        a = in.nextInt();
        b = in.nextInt();
        int jishu = 0;
        for (int i = a; i <= b; i++) {
            if (jishu % 5 == 0 && jishu != 0) {
                System.out.println();
            }
            System.out.printf("%5d", i);
            jishu++;
            sum += i;

        }
        System.out.println();
        System.out.print("Sum = " + sum);
    }
}
