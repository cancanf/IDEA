package 寒假作业.day07;

import java.util.Arrays;

public class P1_2 {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(a)));
    }

    public static int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        int left = 0, right = 0;
        while (i < j) {
            left = A[i] % 2;
            right = A[j] % 2;
            if (left > right) {
                int temp;
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
            if (left == 0) i++;
            if (right == 1) j--;
        }
        return A;
    }
}
