package 寒假作业.day07;

import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(a)));
    }

    public static int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;
        int[] b = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                b[left] = A[i];
                left++;
            } else {
                b[right] = A[i];
                right--;
            }
        }
        return b;
    }
}
