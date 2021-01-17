package 开放性实验;

import java.util.Scanner;

public class 冒泡 {
    public static void main(String[] args) {
        int bijiao = 0, yidong = 0;
        int size = 20000;
        Scanner in = new Scanner(System.in);
        int[] ayyay = new int[size];
        int temp;
        for (int i = 0; i < size; i++) {
            ayyay[i] = in.nextInt();
        }
        long sfbegin = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                bijiao++;

                if (ayyay[i] > ayyay[j]) {
                    temp = ayyay[i];
                    ayyay[i] = ayyay[j];
                    ayyay[j] = temp;
                    yidong += 3;
                }
            }
        }
        long sfend = System.currentTimeMillis();
        System.out.println("算法运行时间： " + (sfend - sfbegin));
        System.out.println("关键字比较次数" + bijiao);
        System.out.println("关键字移动次数" + yidong);
    }
}
