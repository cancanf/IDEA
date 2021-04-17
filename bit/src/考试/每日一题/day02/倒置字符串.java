package 考试.每日一题.day02;

import java.util.Scanner;

public class 倒置字符串 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] s = str.split(" ");
        int i = s.length - 1;
        for (; i >= 0; i--) {
            System.out.print(s[i] + " ");
        }
    }
}
