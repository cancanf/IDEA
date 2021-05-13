package 考试.每日一题.day19;

import java.util.HashSet;
import java.util.Scanner;

public class zichuan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s1 = in.nextLine();
            String s2 = in.nextLine();

            String max = "";
            for (int i = 0; i < s1.length(); i++) {
                for (int j = s1.length(); j >= i; j--) {
                    String s = s1.substring(i, j);
                    if (s2.contains(s) && s.length() > max.length()) {
                        max = s;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
