package blackhouse.p298.函数式接口.常用函数式接口;

import java.util.function.Supplier;

public class Demo02Test {

    public static int getMax(Supplier<Integer> sup) {
        return sup.get();

    }

    public static void main(String[] args) {
        int[] arr = {0, 100, 88, 99, 33, -50, 59};


        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
}
