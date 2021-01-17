package 寒假作业.day02;

public class P2 {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        System.out.println(searchInsert(nums, -1));
    }

    public static int searchInsert(int[] nums, int target) {
        int begin=0,zhong=-1,end= nums.length-1,ans = nums.length;
        while(begin <= end){
            zhong = (begin+end)/2;
            if(target<nums[zhong]){
                end = zhong-1;
                ans = zhong;
            }else if(target>nums[zhong]){
                begin = zhong+1;
            }else if(target == nums[zhong]){
                return zhong;
            }
        }
        return ans;
    }

}
