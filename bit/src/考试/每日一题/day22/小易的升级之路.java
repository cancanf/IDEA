package 考试.每日一题.day22;

import java.util.Scanner;

public class 小易的升级之路 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int ability = in.nextInt();
            int b;
            for (int i = 0; i < n; i++) {
                b = in.nextInt();
                if (b <= ability) {
                    ability += b;
                } else {
                    ability += gongyue(b, ability);
                }
            }
            System.out.println(ability);
        }

    }

    private static int gongyue(int b, int ability) {
        for (int i = b; i >= 1; i--) {
            if (ability % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
