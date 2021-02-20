package 课堂代码.数据和运算符;

import java.util.Random;
import java.util.Scanner;

public class p_7 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100) + 1;//数字范围在1-100之间
        Scanner in = new Scanner(System.in);
        while (true) {
            int b = in.nextInt();
            if (b > a) {
                System.out.println("大了");
            } else if (b < a) {
                System.out.println("小了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
