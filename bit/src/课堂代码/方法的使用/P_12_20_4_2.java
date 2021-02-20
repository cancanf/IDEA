package 课堂代码.方法的使用;

public class P_12_20_4_2 {
    public static void main(String[] args) {
        max(12, 50);
        max(12.2, 50.5);
        max(12.2, 50.5, 555);
    }

    private static void max(double v, double v1, int i) {
        double max = v > v1 ? v : v1;
        max = max > i ? max : i;
        System.out.println(max);
    }

    private static void max(double v, double v1) {
        System.out.println(v > v1 ? v : v1);
    }

    private static void max(int i, int i1) {
        System.out.println(i > i1 ? i : i1);
    }
}
