package 寒假作业.day08;

public class P2 {
    public static void main(String[] args) {

    }

    public int thirdMax(int[] nums) {
        int first = 0, secend = 0, third = 0;
        for (int i : nums) {
            if (i > third && i < secend) {
                third = i;
            }
            if (i > secend && i < first) {
                secend = i;
            }
            if (i > first) {
                first = i;
            }
        }
        return 1;
    }
}
