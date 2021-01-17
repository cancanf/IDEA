package blue.PTA.选拔赛前热身;

import java.util.Scanner;

public class zuijia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        N = in.nextInt();
        String xingbie[] = new String[N];
        double shengao[] = new double[N];
        for (int i = 0; i < N; i++) {
            xingbie[i] = in.next();
            shengao[i] = in.nextDouble();

        }
        for (int i = 0; i < N; i++) {
            if (xingbie[i].equals("F")) {
                System.out.printf("%.2f\n", shengao[i] * 1.09);
            } else if (xingbie[i].equals("M")) {
                System.out.printf("%.2f\n", shengao[i] / 1.09);
            }
        }

    }
}
