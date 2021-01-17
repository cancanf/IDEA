package 课堂代码.方法的使用;

import java.util.Scanner;

public class P_12_20_4_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 5;
        int[] ints = new int[size];

        for (int i = 0; i < size; i++) {
            ints[i] = in.nextInt();
        }
        for (int i = 0; i < size; i++) {
            boolean flag = true;
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    continue;
                }
                if (ints[i] == ints[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(ints[i]);
                return;
            }
        }
    }
}
