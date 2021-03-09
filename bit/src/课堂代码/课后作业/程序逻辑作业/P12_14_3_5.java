package 课堂代码.课后作业.程序逻辑作业;

import java.util.Scanner;

public class P12_14_3_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password = "123456789";

        for (int i = 1; i <= 3; i++) {
            System.out.println("请第" + i + "次输入密码");
            if (password.equals(in.nextLine())) {
                System.out.println("密码正确");
                break;
            } else {
                System.out.println("密码错误\n");
                if (i == 3)
                    System.out.println("错误三次 ,程序退出");
            }
        }

    }
}
