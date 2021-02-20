package 课堂代码.程序逻辑作业;

public class P12_14_3_1 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += caluculate(i);
        }
        System.out.println(sum);
    }

    private static double caluculate(int i) {
        return 1.0 / (i - 1) - 1.0 / (i);
    }
}
