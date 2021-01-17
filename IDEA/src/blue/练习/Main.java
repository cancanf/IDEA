package blue.练习;

import java.util.Scanner;

public class Main {
    static int sum, cnt = 0x3f3f3f3f, value[] = new int[15];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
            sum += value[i] = in.nextInt();
        dfs(0, 0);
        System.out.print(cnt);
    }

    static void dfs(int d, int v) {
        if (d == 15) cnt = min(cnt, abs(sum - v - v));
        else {
            dfs(d + 1, v + value[d]);
            dfs(d + 1, v);
        }
    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }

    static int abs(int a) {
        return a > 0 ? a : -a;
    }
}
