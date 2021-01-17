package blue.PTA.不明;

import java.util.Scanner;

public class L1_005_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //输入部分
        long l1 = System.currentTimeMillis();
        int N, k;
        N = in.nextInt();
        long[][] longs = new long[N][3];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                longs[i][j] = in.nextLong();
            }

        }

        k = in.nextInt();
        //输出部分
        for (int i = 0; i < k; i++) {
            long b = in.nextLong();
            for (int j = 0; j < N; j++) {
                if (b == longs[j][1]) {
                    System.out.println(longs[j][0] + " " + longs[j][2]);
                }
            }

        }
        long l2 = System.currentTimeMillis();
//        System.out.println(l2-l1);
    }
}
