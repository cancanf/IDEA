package 考试.每日一题.day19;

import java.util.Scanner;

public class qishui {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) {
                return;
            }
            int huan = 0;
            int yu = 0;
            while (n >= 2) {
                huan += n / 3;
                yu = n / 3;
                n = n % 3;
                if (n == 2) {
                    huan++;
                    n = 0;
                }
                n += yu;
            }
            System.out.println(huan);
        }
    }
}
