package 考试.每日一题.day03;

import java.util.Scanner;

public class 最长连续数字串 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] chars = in.nextLine().toCharArray();
        int max = 0, sum = 0;
        int i = 0, j = 0;
        int begin = 0, end = 0;
        for (; j < chars.length; i++) {
            if ('0' <= chars[i] && chars[i] <= '9') {
                j = i;
                while (j < chars.length && ('0' <= chars[j] && chars[j] <= '9')) {
                    j++;
                }
                sum = j - i;
                if (max < sum) {
                    max = sum;
                    begin = i;
                    end = j;
                }
                i = j;
            }

        }
        for (; begin < end; begin++) {
            System.out.print(chars[begin]);
        }
    }
}
