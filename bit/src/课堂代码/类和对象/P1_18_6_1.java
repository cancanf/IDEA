package 课堂代码.类和对象;

import java.util.Arrays;

public class P1_18_6_1 {
    public static void main(String[] args) {
        int[] a = {1, 5, 6, 4, 8, 9, 4, 5, 1, 2, 3, 6};
        //奇数放后面,偶数放前面
        int i = 0, j = a.length - 1;
        while (i < j) {
            for (; i < j; i++) {
                if ((a[i] % 2) != 0) {
                    break;
                }
            }
            for (; j > i; j--) {
                if (a[j] % 2 == 0) {
                    break;
                }
            }
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
