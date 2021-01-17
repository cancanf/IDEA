package 课堂代码.数据和运算符;

import java.util.Scanner;

public class p_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (check(in.nextInt())) {
            System.out.println("是素数");
        } else {
            System.out.println("不是素数");
        }
    }

    private static boolean check(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
