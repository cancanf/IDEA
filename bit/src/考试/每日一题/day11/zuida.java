package 考试.每日一题.day11;

import java.util.LinkedList;
import java.util.Scanner;

public class zuida {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int b = in.nextInt();
            //转成二进制
            StringBuffer sb = new StringBuffer();
            while (b != 0) {
                sb.append(b % 2);
                b = (b / 2);
            }
            //统计连续1最大的个数

            char[] chars = sb.toString().toCharArray();
            int max = 0;
//        char[] chars1 = new char[chars.length + 1];
//        for (int i = 0; i < chars.length; i++) {
//            chars1[i] = chars[i];
//        }
//        chars1[chars.length] = 0;

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '1') {
                    int j = i;
                    while (j < chars.length && chars[j] == '1') {
                        j++;
                    }
                    int sum = j - i;
                    j = i;
                    if (sum > max) {
                        max = sum;
                    }
                }
            }

            System.out.println(max);
        }
    }
}
