package 寒假作业.day06;

import java.util.Arrays;

public class p2 {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    public static String reverseOnlyLetters(String S) {
        //记录字母的下标,倒序填入;
        char[] chars1 = S.toCharArray();
        int[] ints = new int[chars1.length];
        int j = 0;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] <= 'z' && chars1[i] >= 'a' || chars1[i] <= 'Z' && chars1[i] >= 'A') {
                ints[j] = i;
                j++;
            }
        }
        char[] chars2 = S.toCharArray();
        j--;
        for (int i = 0; j >= 0; j--, i++) {
            chars2[ints[j]] = chars1[ints[i]];
        }

        return String.valueOf(chars2);
    }
}
