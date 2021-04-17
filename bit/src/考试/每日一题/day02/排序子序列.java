package 考试.每日一题.day02;

import java.util.Scanner;

public class 排序子序列 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int i = 1, sum = 0;
        while (i < n) {
            if (a[i - 1] < a[i]) {
                while (i < n && a[i - 1] <= a[i]) {
                    i++;
                }
                sum++;
                i++;
            } else if (a[i - 1] == a[i]) {
                i++;
            } else if (a[i - 1] > a[i]) {
                while (i < n && a[i - 1] >= a[i]) {
                    i++;
                }
                sum++;
                i++;
            }
        }
        System.out.println(sum);
    }
}

