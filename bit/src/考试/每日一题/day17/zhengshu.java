package 考试.每日一题.day17;

import java.util.Scanner;

public class zhengshu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String addend = in.nextLine();
            String augend = in.nextLine();
            int lenth1 = addend.length();
            int lenth2 = augend.length();
            String ret = null;
            if (lenth1 > lenth2) {
                ret = AddLongInteger(addend, augend);
            } else {
                ret = AddLongInteger(augend, addend);
            }
            System.out.println(ret);
        }

    }

    public static String AddLongInteger(String addend, String augend) {
        StringBuilder addbui = new StringBuilder(addend);
        StringBuilder augbui = new StringBuilder(augend);
        char[] add = addbui.reverse().toString().toCharArray();
        char[] aug = augbui.reverse().toString().toCharArray();
        char[] ret = new char[addend.length() + 1];
        int minlength = augend.length();
        int maxlength = addend.length();
        int jin = 0;

        for (int i = 0; i < minlength; i++) {
            int sum = add[i] + aug[i] + jin - ('0' * 2);
            ret[i] = (char) (sum % 10 + '0');
            jin = sum / 10;
        }
        for (int i = minlength; i < maxlength; i++) {
            int sum = add[i] + jin - '0';
            ret[i] = (char) (sum % 10 + '0');
            jin = sum / 10;
        }
        if (jin != 0) {
            ret[maxlength] = '1';
        }
        return new StringBuilder(String.copyValueOf(ret)).reverse().toString();
    }
}
