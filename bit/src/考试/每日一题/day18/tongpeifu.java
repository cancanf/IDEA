package 考试.每日一题.day18;

import java.util.Scanner;

public class tongpeifu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] c1 = in.nextLine().toCharArray();
        char[] c2 = in.nextLine().toCharArray();
        int max = Math.max(c1.length, c2.length);
        int j = 0, k = 0;
        while (j < c1.length && k < c2.length) {
            while (c1[j] == c2[k]) {
                j++;
                k++;
            }
            if (c1[j] == '*') {
                j++;
                while (k < c2.length && c1[j] != c2[k]) {
                    k++;
                }
            }
            if (c1[j] == '?') {

            }
            System.out.println(false);
            return;
        }


    }
}
