package 天梯赛2020;

import java.util.Scanner;

public class L1_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        int jishu = 0, oushu = 0;
        for (int i = 0; i < a; i++) {
            if (in.nextInt() % 2 == 0) {
                jishu++;
            } else {
                oushu++;
            }
        }
        System.out.print(oushu + " " + jishu);

    }
}
