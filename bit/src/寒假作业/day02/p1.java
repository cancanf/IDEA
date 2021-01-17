package 寒假作业.day02;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(a,2));


    }
    public static int removeElement(int[] nums, int val){
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[num] = nums[i];
                num++;
            }
        }
        System.out.println(Arrays.toString(nums));
     return num;
    }
}
