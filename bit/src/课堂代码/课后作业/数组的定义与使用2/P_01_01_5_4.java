package 课堂代码.课后作业.数组的定义与使用2;

import java.util.Arrays;

public class P_01_01_5_4 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = copyOf(a);
        int[] c = a;
        a[0] = 100;
        b[0] = 10;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        c[1] = 20;
        System.out.println(Arrays.toString(c));
    }

    private static int[] copyOf(int[] a) {
        return Arrays.copyOf(a, a.length);
    }
}
