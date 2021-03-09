package 课堂代码.课后作业.数组的定义与使用2;

import java.util.Scanner;

public class P_01_01_5_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5, 6, 8, 9, 22, 65, 77, 100};
        System.out.println("查找的值是第" + (binarysearch(a, in.nextInt()) + 1) + "个");
    }

    private static int binarysearch(int[] a, int b) {
        int begin = 0, end = a.length - 1;
        while (begin <= end) {
            int middle = (begin + end) / 2;
            if (b == a[middle]) {
                return middle;
            } else if (b < a[middle]) {
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
        }
        return -1;
    }
}

