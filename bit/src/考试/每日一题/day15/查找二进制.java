package 考试.每日一题.day15;

import java.util.Scanner;

public class 查找二进制 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int input = in.nextInt();
            int sum = 0;
            char[] chars = Integer.toBinaryString(input).toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '1') {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }

}
