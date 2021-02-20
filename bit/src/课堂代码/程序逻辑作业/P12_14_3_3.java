package 课堂代码.程序逻辑作业;

import java.util.Scanner;

public class P12_14_3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
//        System.out.println(Integer.toBinaryString(input));
        int sum = 0;
        System.out.println(Integer.toBinaryString(input));
        while (input != 0) {
            input = input & (input - 1);
            sum++;
        }
        System.out.println(sum);
    }
}
