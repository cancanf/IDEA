package 寒假作业.day07;


public class P2 {


    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(pivotIndex(a));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int leftsum = 0;
        for (int i :
                nums) {
            sum += i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}
