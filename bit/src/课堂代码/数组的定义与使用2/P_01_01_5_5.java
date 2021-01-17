package 课堂代码.数组的定义与使用2;

import java.util.Arrays;

public class P_01_01_5_5 {
    public static void main(String[] args) {
        int[] a = {1,5,6,9,8,5};
        System.out.println(toString(a));
        Arrays.toString(a);
    }

    private static String toString(int[] a) {
        String str = "[" + a[0];
        for (int i = 1; i <a.length ; i++) {
            str = str + "," + a[i];
        }
        return str + "]";
    }
}
