package 考试.每日一题.day25;

import java.util.Scanner;

public class 星际密码 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                String fibo = fibo(in.nextInt());
                StringBuilder builder1;
                builder1 = new StringBuilder(fibo).reverse();
                for (int j = fibo.length(); j < 4; j++) {
                    builder1.append("0");
                }
                builder.append(builder1.reverse());
            }
            System.out.println(builder);
        }
    }

    private static String fibo(int nextInt) {
        int[] f = {1, 2, 0};
        if (nextInt == 2) {
            return String.valueOf(f[1]);
        } else if (nextInt == 1) {
            return String.valueOf(f[0]);
        } else {
            for (int i = 2; i < nextInt; i++) {
                f[2] = f[1] + f[0];
                f[0] = f[1];
                f[1] = f[2];
                f[2] = f[2] % 10000;
                f[1] = f[1] % 10000;
                f[0] = f[0] % 10000;
            }
            return String.valueOf(f[2]);
        }
    }
}
