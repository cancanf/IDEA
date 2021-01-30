package 课堂代码.图书管理系统.BooKSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //书籍数据初始化
        BookList bookList = new BookList();
        //创建用户
        User user = Login();
        while (true) {
            //这里是多态的用法,如果在Login方法中返回了Admin的实例就调用Admin的方法.反之调用NormalUser
            int choice = user.menu();

            user.doOperation(choice, bookList);
        }
    }

    private static User Login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名: ");
        String name = scanner.next();
        System.out.println("请输入您的角色: 1 管理员, 0 普通用户");
        int who = scanner.nextInt();
        //通过数字选择返回不容的对象,他们共同的父类为User,是有个向上转型的用法
        if (who == 1) {
            return new Admin(name);
        }
        return new NormalUser(name);

    }
}
