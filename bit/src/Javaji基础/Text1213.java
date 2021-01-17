package Javaji基础;

import java.util.Arrays;

public class Text1213 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        fun(arr);
        System.out.println(Arrays.toString(arr));
        Cat cat = new Cat();
        cat.abc = 1;


    }

    private static void fun(int[] arr) {
        int[] b = {5,4,3,2,1};
        arr=b;
    }

}
