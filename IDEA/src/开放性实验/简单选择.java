package 开放性实验;

import java.util.Scanner;

public class 简单选择 {
    public static void main(String[] args) {
        int bijiao = 0, yidong = 0;
        int i, j, min, temp, size = 20000;
        int[] ints = new int[size];
        Scanner in = new Scanner(System.in);
        for (int k = 0; k < size; k++) {
            ints[k] = in.nextInt();
        }
        long sfbegin = System.currentTimeMillis();
        for (i = 0; i < size; i++) {
            min = i;
            for (j = i + 1; j < size; j++) {
                bijiao++;
                if (ints[j] < ints[min]) {
                    min = j;
                }
            }
            if (i != min) {
                temp = ints[min];
                ints[min] = ints[i];
                ints[i] = temp;
                yidong += 3;
            }
        }
        long sfend = System.currentTimeMillis();
        System.out.println("算法运行时间： " + (sfend - sfbegin));
        System.out.println("关键字比较次数" + bijiao);
        System.out.println("关键字移动次数" + yidong);
    }
}
