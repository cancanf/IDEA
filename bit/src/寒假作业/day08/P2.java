package 寒假作业.day08;

public class P2 {
    public static void main(String[] args) {
        int[] a = {1, 2, -2147483648};

        System.out.println(thirdMax(a));

    }

    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE, secend = Long.MIN_VALUE, third = Long.MIN_VALUE;
        for (int i : nums) {
            if (i == first || i == secend || i == third) {
                continue;
            }
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

        if (third != Long.MIN_VALUE) {
            return (int) third;
        }
        return (int) first;
    }
}
