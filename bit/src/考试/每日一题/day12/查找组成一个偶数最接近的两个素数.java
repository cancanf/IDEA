package 考试.每日一题.day12;

import java.util.Scanner;

public class 查找组成一个偶数最接近的两个素数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int input = in.nextInt();
            int moddle = input / 2;
            int i = moddle, j = moddle;
            while (i >= 1 && j <= input) {
                if (check(i) && check(j)) {
                    System.out.println(i);
                    System.out.println(j);
                    break;
                }
                i--;
                j++;
            }
        }
    }

    private static boolean check(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
