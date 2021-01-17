package blackhouse.java基础.异常处理.Demo03.Exception;

import java.util.Scanner;

public class Demo01RegisterException {

    static String[] usernames = {"张三", "李四", "王麻子"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入您要注册的用户名");
        String username = in.next();
        checkUsername(username);

    }

    private static void checkUsername(String username) {
        for (String name :
                usernames) {
            if (name.equals(username)) {
                try {
                    throw new RegisterException("重名");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("注册成功");
    }
}
