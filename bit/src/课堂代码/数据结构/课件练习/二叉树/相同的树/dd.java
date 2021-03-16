package 课堂代码.数据结构.课件练习.二叉树.相同的树;

import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int[] a = new int[9];
        for (int i = 8; i >= 0; i--) {
            a[i] = i;
        }
        int number = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int i = 0, j = a.length - 1;
        while (i <= j) {
            int moddle = (i + j) >> 1;
            if (a[moddle] < number) {
                i = moddle + 1;
            } else if (a[moddle] > number) {
                j = moddle - 1;
            } else if (a[moddle] == number) {
                System.out.println("number在数组a中");
                return;
            }
        }
        System.out.println("number不在数组a中");
        System.out.println(Arrays.toString(a));
    }
}
