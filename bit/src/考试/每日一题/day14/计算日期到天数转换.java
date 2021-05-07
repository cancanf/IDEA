package 考试.每日一题.day14;

import java.util.Scanner;

public class 计算日期到天数转换 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int year = in.nextInt();
            int mon = in.nextInt();
            int day = in.nextInt();
            int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int sum = 0;
            if (check(year)) {
                for (int i = 0; i < mon - 1; i++) {
                    sum += b[i];
                }
            } else {
                for (int i = 0; i < mon - 1; i++) {
                    sum += a[i];
                }
            }
            sum = sum + day;
            System.out.println(sum);
        }

    }

    private static boolean check(int year) {
        //整百年
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else return year % 4 == 0;
    }
}
