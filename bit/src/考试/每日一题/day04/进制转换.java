package 考试.每日一题.day04;

import java.util.Scanner;

public class 进制转换 {
    public static void main(String[] args) {
        //十进制转换为N进制数
        //正负要判断
        Scanner in = new Scanner(System.in);
        int n, r;
        boolean flag = true;
        StringBuffer number = new StringBuffer();
        while (in.hasNext()) {
            flag = true;
            n = in.nextInt();
            r = in.nextInt();
            if (n < 0) {
                n = -n;
                flag = false;
            }
            while (n != 0) {
                int f = n % r;
                if (f >= 10) {
                    number.append((char) (f - 10 + 'A'));
                } else {
                    number.append((char) (f + '0'));
                }
                n = n / r;
            }
            number = number.reverse();
            if (!flag) {
                number.insert(0, "-");
            }
            System.out.println(number.toString());
        }
    }
}
