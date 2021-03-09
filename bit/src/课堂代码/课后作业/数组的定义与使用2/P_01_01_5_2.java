package 课堂代码.课后作业.数组的定义与使用2;

public class P_01_01_5_2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 10, 9};
        orderly(a);
        System.out.println("=============");
        orderly(b);
    }

    private static void orderly(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                System.out.println("数组无序");
                return;
            }
        }
        System.out.println("数组有序");
    }
}
