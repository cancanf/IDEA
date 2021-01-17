package 课堂代码.方法的使用;

import java.util.Arrays;

public class P_12_20_4_4_2 {
    public static void main(String[] args) {
        int[] ints = {1, 6, 4, 5, 8, 3, 9};
        int left = 0, right = ints.length - 1;
        int temp = -1;
        while (left < right) {
            //第一种
            for (; left < ints.length && left < right; left++) {
                if (ints[left] % 2 == 0) {
                    temp = ints[left];
                    break;
                }
            }
            for (; right >= 0 && left < right; right--) {
                if (ints[right] % 2 != 0) {
                    ints[left] = ints[right];
                    ints[right] = temp;
                    break;
                }
            }
            right--;
            left++;
            //第二种
//            while (left < right && ints[left] % 2 != 0) {
//                left++;
//            }
//            while (left < right && ints[right] % 2 == 0) {
//                right--;
//            }
//            temp = ints[left];
//            ints[left] = ints[right];
//            ints[right] = temp;
        }
        System.out.println(Arrays.toString(ints));
    }
}
