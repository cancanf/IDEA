package 课堂代码.方法的使用;

public class P_12_20_4_1 {
    public static void main(String[] args) {
        add(1, 2);
        add(0.1, 1.2, 1.3);
    }

    private static void add(double v, double v1, double v2) {
        System.out.println(v + v + v2);
    }

    private static void add(int i, int i1) {
        System.out.println(i + i1);
    }
}
