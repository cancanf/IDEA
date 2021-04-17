package 课堂代码.数据结构.课件练习.Sort;

import java.util.Arrays;
import java.util.Random;

public class insertSort {
    //插入排序
    public static void main(String[] args) {
        int[] ints = new int[100];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(ints));
        insertsort(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void insertsort(int[] arr) {
        //从数组第二个元素开始向后遍历
        for (int bound = 1; bound < arr.length; bound++) {
            //用 V 存储
            int temp = arr[bound];
            //向前依次寻找合适的插入位置
            for (int cur = bound - 1; cur >= 0; cur--) {
                //如果插入位置的值大于V ,表示需要交换顺序
                if (arr[cur] > temp) {
                    arr[bound] = arr[cur];
                    arr[cur] = temp;
                } else {
                    break;
                }
            }

        }
    }

}
