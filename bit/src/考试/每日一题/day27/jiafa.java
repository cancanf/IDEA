package 考试.每日一题.day27;

import java.util.Scanner;

public class jiafa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            while (num2 != 0) {
                int temp = num1 & num2;
                num1 ^= num2;
                num2 = temp >> 1;
            }
            System.out.println(num1);
        }
    }
}
