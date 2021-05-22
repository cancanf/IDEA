package 考试.每日一题.day30;

import java.util.HashMap;
import java.util.Scanner;

public class 最难的问题 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            HashMap<Character, Character> map = new HashMap<>();
            //密文到原文
            for (int i = 0; i < 26; i++) {
                int shu = 'A' + i + 5;
                if (shu > 'Z') {
                    shu = shu - 26;
                }
                char miwen = (char) shu;
                map.put(miwen, (char) ('A' + i));
            }
            char[] chars = in.nextLine().toCharArray();
            for (char temp : chars) {
                if (temp == ' ') {
                    System.out.print(" ");
                } else {
                    System.out.print(map.get(temp));
                }
            }
            System.out.println();
        }
    }
}
