package 课堂代码.程序逻辑作业;

import java.util.Scanner;

public class P12_14_3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int a = (n < m) ? common(n, m) : common(m, n);
        System.out.println(a);
    }

    private static int common(int min, int max) {
        for (int i = min; i > 0; i--) {
            if (min % i == 0 && max % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
