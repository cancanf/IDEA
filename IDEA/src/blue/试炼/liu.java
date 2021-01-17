package blue.试炼;

import java.util.Scanner;

public class liu {

    private static boolean check(int n) {
        while (n > 0) {
            if (n % 10 == 2 || n % 10 == 0 || n % 10 == 1 || n % 10 == 9) {
                return true;
            } else {
                n = n / 10;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int m;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        m = in.nextInt();
        for (int i = 1; i <= m; i++) {
            if (check(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }


}
