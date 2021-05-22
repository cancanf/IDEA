package 考试.每日一题.day30;


import java.util.Scanner;

public class 因数个数2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int i = in.nextInt();
            int sum = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    while (i % j == 0) {
                        i = i / j;
                    }
                    sum++;
                }
            }
            if (i != 1) {
                sum++;
            }
            System.out.println(sum);
        }
    }
}
