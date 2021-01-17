package blue.luogu;

import java.util.Scanner;

public class P1271 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m;
        int min = 0;
        n = in.nextInt();
        m = in.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < m; i++) {
            min = i;
            for (int j = i; j < m; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
