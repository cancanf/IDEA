package 考试.每日一题.day26;

import java.util.Scanner;

public class taijie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int i = jumpFloorII(n);
            System.out.println(i);
        }
    }

    public static int jumpFloorII(int target) {
        //动态规划
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        return jumpFloorII(target - 1) + jumpFloorII(target - 2);
    }
}
