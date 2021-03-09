package 课堂代码.课后作业.自定义异常;

import java.util.Scanner;


public class P_1 {
    public static void main(String[] args) {
        login();
    }

    private static void login() {
        Scanner in = new Scanner(System.in);

        String password = "123456789";
        String username = "admin";
        System.out.println("请输入用户名: ");
        String enterUserName = in.nextLine();
        System.out.println("请输入密码: ");
        String enterPassWord = in.nextLine();
        try {
            if (!password.equals(enterPassWord) || !username.equals(enterUserName)) {
                throw new Exception("用户名错误或密码错误请重新输入 ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
