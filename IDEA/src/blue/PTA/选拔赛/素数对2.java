package blue.PTA.选拔赛;

import java.util.Scanner;

public class 素数对2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isok = true;
        int[] a = new int[100000];
        int k = 0;
        for (int i = 1; i < n; i++) {
            isok = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    isok = false;
                    continue;
                }
            }
            if (isok) {
                a[k] = i;
                k++;
            }
        }
        int jishu = 0;
        for (int i = 0; i < k; i++) {
            if (a[i] + 2 == a[i + 1]) {
                jishu++;
            }
        }
        System.out.print(jishu);

    }
}

