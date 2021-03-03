package 寒假作业.day11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class P2 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        //回文字串,除了字母数字忽略,大小写忽略.
        s = s.toLowerCase(Locale.ROOT);
        int i = 0, j = 0;
        char[] chars = s.toCharArray();
        char[] newchar = new char[chars.length];
        for (; i < s.length() && j < s.length(); j++) {
            if ('0' <= chars[j] && chars[j] <= '9' || 'a' <= chars[j] && chars[j] <= 'z') {
                newchar[i] = chars[j];
                i++;
            }
        }
        j = i - 1;
        i = 0;
        while (i < j) {
            if (newchar[i] != newchar[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
