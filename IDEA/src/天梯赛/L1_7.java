package 天梯赛2020;

import java.util.Scanner;

public class L1_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String L = in.next();
        int K = in.nextInt();
        in.nextLine();
        String N = in.nextLine();
        for (int i = 0; i <= N.length() - K; i++) {
            String s = N.substring(i, i + K);
            int l = Integer.parseInt(s);
            //判断是否为素数
            if (sushu(l)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println(404);
    }

    private static boolean sushu(long l) {
        if (l == 1 || l == 0) {
            return false;
        }
        for (int j = 2; j < Math.sqrt(l); j++) {
            if (l % j == 0) {
                return false;
            }
        }
        return true;
    }
}
