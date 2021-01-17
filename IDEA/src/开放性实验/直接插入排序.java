package 开放性实验;

import java.util.Scanner;

public class 直接插入排序 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, size = 20000, temp;
        int bijiao = 0, yidong = 0;
        int[] array = new int[size];
        for (int k = 0; k < size; k++) {
            array[k] = in.nextInt();
        }
        long begin = System.currentTimeMillis();

        for (i = 1; i < size; i++) {
            temp = array[i];
            j = i - 1;
            if (j >= 0 && temp < array[j]) {
                while (j >= 0 && temp < array[j]) {
                    array[j + 1] = array[j];
                    array[j] = temp;
                    j--;
                    yidong += 3;
                    bijiao++;
                }
            } else {
                bijiao++;
            }
        }
        long end = System.currentTimeMillis();
        for (int k = 0; k < size; k++) {
            System.out.println(array[k]);
        }
        System.out.println("算法运行时间： " + (end - begin));
        System.out.println("关键字比较次数" + bijiao);
        System.out.println("关键字移动次数" + yidong);
    }
}
