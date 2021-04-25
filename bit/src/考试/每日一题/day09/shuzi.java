package 考试.每日一题.day09;

import java.util.Scanner;

public class shuzi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            char[] chars = in.nextLine().toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                System.out.print(chars[i]);
            }
            System.out.println();
        }
    }
}
