package 课堂代码.数组的定义与使用;

public class P12_25_5_3 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        transform(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    private static void transform(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = ints[i] * 2;
        }
    }
}
