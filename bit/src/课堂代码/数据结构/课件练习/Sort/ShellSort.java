package 课堂代码.数据结构.课件练习.Sort;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {
    public static void main(String[] args) {
        int[] ints = new int[100];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(ints));
        shellSort(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void shellSort(int[] arr) {
        int gap = arr.length >> 1;
        while (gap >= 1) {
            _shellSort(arr, gap);
            gap = gap >> 1;
        }
    }

    private static void _shellSort(int[] arr, int gap) {

    }
}
