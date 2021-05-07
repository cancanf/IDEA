package 考试.每日一题.day17;

import java.util.Arrays;
import java.util.Scanner;

public class zhengshu2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String addend = in.nextLine();
            String augend = in.nextLine();
            System.out.println(AddLongInteger(augend, addend));
        }

    }

    public static String AddLongInteger(String addend, String augend) {
        char[] add = new StringBuilder(addend).reverse().toString().toCharArray();
        char[] aug = new StringBuilder(augend).reverse().toString().toCharArray();
        int max = Math.max(add.length, aug.length);
        char[] addcopy = Arrays.copyOf(add, max);
        char[] augcopy = Arrays.copyOf(aug, max);
        char[] ret = new char[max];
        int jin = 0;
        for (int i = 0; i < max; i++) {
            int sum = 0;
            if (addcopy[i] == 0) {
                sum = augcopy[i] + jin - ('0');
            } else if (augcopy[i] == 0) {
                sum = addcopy[i] + jin - ('0');
            } else {
                sum = addcopy[i] + augcopy[i] + jin - ('0' * 2);
            }
            ret[i] = (char) (sum % 10 + '0');
            jin = sum / 10;
        }

        if (jin == 1) {
            char[] chars = Arrays.copyOf(ret, max + 1);
            chars[chars.length - 1] = '1';
            return new StringBuilder(String.copyValueOf(chars)).reverse().toString();
        }
        return new StringBuilder(String.copyValueOf(ret)).reverse().toString();
    }

}