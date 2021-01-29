package 寒假作业.day08;

import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(plusOne(a)));
    }

    public static int[] plusOne(int[] digits) {
        return new int[]{1};
    }
}
