package 寒假作业.day06;

import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        int[] a = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(a)));

    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
            ;
        }
        Arrays.sort(nums);
        return nums;
    }
}
