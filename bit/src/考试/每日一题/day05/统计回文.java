package 考试.每日一题.day05;

import 寒假作业.day01.练习.A;

import java.util.Scanner;

public class 统计回文 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            char[] A = in.nextLine().toCharArray();
            char[] B = in.nextLine().toCharArray();
            char[] C = new char[A.length + B.length];
            int i = 1, sum = 0, j = A.length - 1;
            while (i <= A.length) {
                System.arraycopy(A, 0, C, 0, i);
                System.arraycopy(B, 0, C, i, B.length);
                System.arraycopy(A, i, C, i + B.length, A.length - i);
                if (check(C)) {
                    sum++;
                }
                i++;
            }
            System.out.println(sum);
        }

    }

    private static boolean check(char[] c) {
        int i = 0, j = c.length - 1;
        while (i <= j) {
            if (c[i] != c[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
