package 考试.每日一题.day22;

import java.util.Scanner;

public class 一个字符 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            char[] chars = in.nextLine().toCharArray();
            int[] words = new int[26];
            int[] WOEDS = new int[26];
            for (int i = 0; i < chars.length; i++) {
                if ('a' <= chars[i] && chars[i] <= 'z') {
                    words[chars[i] - 'a']++;
                } else if ('A' <= chars[i] && chars[i] <= 'Z') {
                    WOEDS[chars[i] - 'A']++;
                }
            }
            boolean sout = true;
            for (int i = 0; i < chars.length; i++) {
                if ('a' <= chars[i] && chars[i] <= 'z') {
                    if (words[chars[i] - 'a'] == 1) {
                        System.out.println(chars[i]);
                        sout = false;
                        break;
                    }
                } else if ('A' <= chars[i] && chars[i] <= 'Z') {
                    if (WOEDS[chars[i] - 'A'] == 1) {
                        System.out.println(chars[i]);
                        sout = false;
                        break;
                    }
                }
            }
            if (sout) {
                System.out.println(-1);
            }
        }
    }
}
