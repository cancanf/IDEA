package 课堂代码.程序逻辑作业;

import java.util.Scanner;

public class P12_14_3_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.printf(i + "*" + j + "=" + (i * j) + "\t");
            }
        }
    }
}
