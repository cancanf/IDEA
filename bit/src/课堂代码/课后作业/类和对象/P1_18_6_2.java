package 课堂代码.课后作业.类和对象;

import java.util.Arrays;

public class P1_18_6_2 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] c1 = a1;
        a1 = b1;
        b1 = c1;
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(b1));
        //交换两个数组内容分为等长和不等长
        //等长
//        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] b1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        swap(a1, b1);
//        System.out.println(Arrays.toString(a1));
//        System.out.println(Arrays.toString(b1));

//        不等长
//        int[] a2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] b2 = {9, 8, 7, 6, 5};
//        swap(a2, b2);
//        System.out.println(Arrays.toString(a2));
//        System.out.println(Arrays.toString(b2));
        int[] a3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b3 = {9, 8, 7, 6, 5};
        b3 = swap2(a3, b3);
        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.toString(b3));

    }

    private static int[] swap2(int[] a, int[] b) {
        int[] low;
        if (a.length > b.length) {
            low = swap3(a, b);
        } else {
            low = swap3(b, a);
        }
        return low;
    }

    private static int[] swap3(int[] longger, int[] shorter) {
        int length = longger.length;
        ;
        int[] b1 = new int[length];
        for (int i = 0; i < length; i++) {
            b1[i] = longger[i];
            longger[i] = 0;
        }

        for (int i = 0; i < shorter.length; i++) {
            longger[i] = shorter[i];
        }
        return b1;
    }

    private static void swap(int[] a, int[] b) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
    }
}
