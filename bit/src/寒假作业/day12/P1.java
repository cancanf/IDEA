package 寒假作业.day12;


import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4, 5};
        System.out.println(findUnsortedSubarray(nums));

    }

    public static int findUnsortedSubarray(int[] nums) {
//        int begin = 0,end = nums.length-1;
//        while (nums[begin] <= nums[begin+1] && begin<end-1){
//            begin++;
//        }
//        while (nums[end-1] <= nums[end] && end > begin){
//            end--;
//        }
//        return end-begin;

        int[] clone = nums.clone();
        int i = nums.length, j = 0;
        Arrays.sort(nums);
        for (int k = 0; k < clone.length; k++) {
            if (clone[k] != nums[k]) {
                //在中间乱序的区间找到角标最小的,和最大的.
                i = Math.min(i, k);
                j = Math.max(j, k);
            }
        }
        System.out.println(i + " " + j);

        return (j - i) > 0 ? j - i + 1 : 0;

//        int[] snums = nums.clone();
//        Arrays.sort(snums);
//        int start = snums.length, end = 0;
//        for (int i = 0; i < snums.length; i++) {
//            if (snums[i] != nums[i]) {
//                start = Math.min(start, i);
//                end = Math.max(end, i);
//            }
//        }
//        return (end - start >= 0 ? end - start + 1 : 0);
    }
}
