package 考试.每日一题.day09;

import java.util.Locale;

public class Test {

    private static void testMethid() {
        System.out.println(1);
    }

    public static void main(String[] args) {
        String s = "fmn".toUpperCase();
        String s1 = s.replace('f', 'F');
        System.out.println(s1);
        int i = 0;
        Integer integer = new Integer(0);
        System.out.println(i == integer);
        System.out.println(integer.equals(i));
    }
}
