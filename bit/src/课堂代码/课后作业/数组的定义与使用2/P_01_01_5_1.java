package 课堂代码.课后作业.数组的定义与使用2;

import java.util.Arrays;
import java.util.Random;

public class P_01_01_5_1 {
    public static void main(String[] args) {
        int[] ints = new int[20000];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1000);
        }
        //升序
        long begin1 = System.currentTimeMillis();
        bubble(ints);
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - begin1);
        System.out.println(Arrays.toString(ints));
        //降序
        long begin2 = System.currentTimeMillis();
        bubblelow(ints);
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - begin2);
        System.out.println(Arrays.toString(ints));
        //改进
        long begin3 = System.currentTimeMillis();
        bubblesort(ints);
        long end3 = System.currentTimeMillis();
        System.out.println(end3 - begin3);
        System.out.println(Arrays.toString(ints));
    }

    //改进
    private static void bubblesort(int[] ints) {
        boolean flag = false;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int tmp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = tmp;
                    flag = true;
                }
                if (!flag) {
                    break;
                }
            }

        }

    }

    //降序
    private static void bubblelow(int[] ints) {
        int temp;
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                if (ints[i] < ints[j]) {
                    temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
    }
    //降序改进

    //升序
    private static void bubble(int[] ints) {
        int temp;
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                if (ints[i] > ints[j]) {
                    temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
    }
//降序

}
