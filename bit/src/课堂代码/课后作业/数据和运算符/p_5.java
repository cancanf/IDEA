package 课堂代码.课后作业.数据和运算符;

import java.util.Scanner;

public class p_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int j = 0; j < 4; j++) {
            int i = in.nextInt();
            if (i >= 56) {
                System.out.println("老年");
            } else if (i >= 29) {
                System.out.println("中年");
            } else if (i >= 19) {
                System.out.println("青年");
            } else {
                System.out.println("少年");
            }
        }

    }
}
