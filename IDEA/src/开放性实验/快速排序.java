package 开放性实验;

import java.util.Arrays;
import java.util.Scanner;

public class 快速排序 {
    static int bijiao = 0, yidong = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 4;

        long begin, end;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        begin = System.currentTimeMillis();
        quick_sort(array, 0, size - 1);
        end = System.currentTimeMillis();
        Arrays.stream(array, 0, size).forEach(System.out::println);
        System.out.println("算法运行时间： " + (end - begin));
        System.out.println("关键字比较次数" + bijiao);
        System.out.println("关键字移动次数" + yidong);

    }

    private static void quick_sort(int[] array, int l, int r) {
        if (l < r) {
            int i = l, j = r, x = array[l];
            while (i < j) {

                while (i < j && array[j] >= x) {
                    j--;
                    bijiao++;
                }
                if (i < j) {
                    array[i] = array[j];
                    i++;
                    yidong += 3;
                }

                while (i < j && array[i] <= x) {
                    i++;
                    bijiao++;
                }
                if (i < j) {
                    array[j] = array[i];
                    j--;
                    yidong += 3;
                }
            }
            array[i] = x;
            quick_sort(array, l, i );
            quick_sort(array, i + 1 , r);
        }
    }
}
