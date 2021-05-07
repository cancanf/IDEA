package 考试.每日一题.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 参数解析 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] chars = s.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while (i < chars.length) {
            StringBuffer buffer = new StringBuffer();
            if (chars[i] == '\"') {
                i++;
                while (i < chars.length && chars[i] != '\"') {
                    buffer.append(chars[i]);
                    i++;
                }
                i = i + 2;
            } else {
                while (i < chars.length && chars[i] != ' ') {
                    buffer.append(chars[i]);
                    i++;
                }
                i++;
            }
            list.add(buffer.toString());
        }
        System.out.println(list.size());
        for (String str :
                list) {
            System.out.println(str);
        }
    }

}
