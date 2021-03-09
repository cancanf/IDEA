package 课堂代码.课后作业.数组的定义与使用;

public class P12_25_5_1 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        System.out.println(avg(ints));
    }

    private static double avg(int[] ints) {
        double sum = 0.0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum / ints.length;
    }
}
