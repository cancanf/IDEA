package 寒假作业.day08;

public class P2 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        System.out.println(thirdMax(a));

    }

    public static int thirdMax(int[] nums) {
        long first = (long) Integer.MIN_VALUE - 1, secend = (long) Integer.MIN_VALUE - 1, third = (long) Integer.MIN_VALUE - 1;
        for (int i : nums) {
            if (i > third && i < secend) {
                third = i;
            } else if (i > secend && i < first) {
                third = secend;
                secend = i;
            } else if (i > first) {
                third = secend;
                secend = first;
                first = i;
            }
        }

        if (third != 0) {
            return (int) third;
        }
        return (int) first;

    }
}
