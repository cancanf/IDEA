package 课堂代码.方法的使用;

public class P_12_20_4_3 {
    public static void main(String[] args) {
        System.out.println(max2(12, 23));
        System.out.println(max3(23, 56, 21));
    }

    private static int max3(int i, int i1, int i2) {
        int temp = max2(i, i1);
        return temp > i2 ? temp : i2;
    }

    private static int max2(int i, int j) {
        return i > j ? i : j;
    }
}
