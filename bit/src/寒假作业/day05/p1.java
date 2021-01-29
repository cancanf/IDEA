package 寒假作业.day05;


import java.util.Arrays;
import java.util.HashSet;

public class p1 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;

    }
}
