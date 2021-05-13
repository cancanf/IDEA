package 考试.每日一题.day20;

import java.util.Scanner;

public class gongzichuan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s1 = in.next();
            String s2 = in.next();
            String max = "";
            for (int i = 0; i < s1.length(); i++) {
                for (int j = i + 1; j <= s1.length(); j++) {
                    String substring = s1.substring(i, j);
                    if (s2.contains(substring)) {
                        if (substring.length() > max.length()) {
                            max = substring;
                        }
                    }
                }
            }
            System.out.println(max.length());
        }
    }
}
