package 寒假作业.day01.作业;

import java.util.Arrays;

public class p2 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7};
        rotate(ints, 3);
        System.out.println(Arrays.toString(ints));
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        swap(nums, 0, nums.length - 1);
        swap(nums, 0, k - 1);
        swap(nums, k, nums.length - 1);
    }

    private static void swap(int[] nums, int begin, int end) {
        for (int i = begin, j = end; i < j; i++, j--) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
    }
}
