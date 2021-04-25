package 考试.每日一题.day07;

import java.util.Scanner;

public class 不要二 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        int[][] ints = new int[w][h];
        int sum = 0;
        ints[0][0] = 1;
        for (int j = 0; j < h; j++) {
            for (int i = 0; i < w; i++) {
                if (check(ints, i, j)) {
                    ints[i][j] = 1;
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }

    private static boolean check(int[][] ints, int i, int j) {
        int cx, cy;
        cx = i - 2;
        cy = j - 2;
        if (cx >= 0 && ints[cx][j] == 1) {
            return false;
        }
        if (cy >= 0 && ints[i][cy] == 1) {
            return false;
        }
        cx = i + 2;
        cy = j + 2;
        if (cx < ints.length && ints[cx][j] == 1) {
            return false;
        }
        if (cy < ints[0].length && ints[i][cy] == 1) {
            return false;
        }
        return true;
    }
}
