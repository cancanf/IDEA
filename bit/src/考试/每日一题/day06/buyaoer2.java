package 考试.每日一题.day06;

import java.util.Scanner;

public class buyaoer2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int h = in.nextInt();
            int w = in.nextInt();
            int[][] sum = new int[h][w];
            int total = 0;
            for (int i = 0; i < w; i++) {
                sum[0][i] = 1;
                total++;
            }
            for (int i = 0; i < h; i++) {
                if (sum[i][0] != 1) {
                    sum[i][0] = 1;
                    total++;
                }
            }
            for (int i = 1; i < h; i++) {
                for (int j = 1; j < w; j++) {
                    if (sum[i - 1][j - 1] == 0) {
                        sum[i][j] = 1;
                        total++;
                    }
                }
            }
            System.out.println(total);
        }
    }
}
