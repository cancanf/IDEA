package 课堂代码.数据结构.课件练习.Sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = new int[100];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(ints));
        bubbleSort(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void bubbleSort(int[] ints) {
        //升序
//        for (int i = 0; i < ints.length; i++) {
//            for (int j = i + 1; j < ints.length; j++) {
//                if(ints[i]>ints[j]){
//                    int temp = ints[i];
//                    ints[i] = ints[j];
//                    ints[j] = temp;
//                }
//            }
//        }
        //降序
        for (int i = ints.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (ints[i] > ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
    }
}
