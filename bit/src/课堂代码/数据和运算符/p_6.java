package 课堂代码.数据和运算符;

import java.util.Scanner;

public class p_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            boolean[][] a = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                a[i][i] = true;
                a[i][n - i - 1] = true;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j]) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
/*



 */