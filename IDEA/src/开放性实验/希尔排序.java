package 开放性实验;

import java.util.Scanner;

public class 希尔排序 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bijiao = 0, yidong = 0, size = 20000;
        long begin, end;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        begin = System.currentTimeMillis();
        for (int gap = size / 2; gap > 0; gap /= 2) {
            for (int j = gap; j < size; j++) {
                int temp = array[j];
                int k = j - gap;
                if (k >= 0 && array[k] > temp) {
                    while (k >= 0 && array[k] > temp) {
                        array[k + gap] = array[k];
                        k -= gap;
                        bijiao++;
                        yidong += 3;
                        array[k + gap] = temp;
                    }
                } else
                    bijiao++;
            }
        }
        end = System.currentTimeMillis();
        System.out.println("算法运行时间: " + (end - begin));
        System.out.println("关键字比较次数: " + bijiao);
        System.out.println("关键字移动次数: " + yidong);
    }
}
