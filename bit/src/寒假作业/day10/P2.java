package 寒假作业.day10;

import java.util.Arrays;

public class P2 {
    public static void main(String[] args) {
        int[] nums = {8, 8, 8, 8, 10};
        int target = 8;
        int[] ints = searchRange(nums, target);
        System.out.println(ints[0] + "," + ints[1]);

    }

    public static int[] searchRange(int[] nums, int target) {
        int begin = 0, end = nums.length - 1;
        int i = -1, j = -1;
        while (begin <= end) {
            int moddle = (begin + end >> 1);
            if (nums[moddle] == target) {
                i = begin;
                while (i < end && nums[i] != target) {
                    i++;
                }
                j = i;
                while (j + 1 <= end && nums[j + 1] == target) {
                    j++;
                }
                return new int[]{i, j};
            } else if (nums[moddle] > target) {
                end = moddle - 1;
            } else {
                begin = moddle + 1;

            }

        }
        return new int[]{-1, -1};
    }
}
