package 课堂代码.课后作业.图书管理系统.resetBookSystem.operation;

import 课堂代码.课后作业.图书管理系统.resetBookSystem.Book;
import 课堂代码.课后作业.图书管理系统.resetBookSystem.BookList;

import java.util.Scanner;

public class BorrowOperation extends FindBook implements IOperation {
    //实现借书的操作
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要借阅的书籍名: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        Book findbook = findbook(name, bookList);
        if (findbook != null) {
            if (!findbook.isBorrowed()) {
                findbook.setBorrowed(true);
                System.out.println("借阅成功");
            } else {
                System.out.println("书本已被借阅,请重新选择 ");
            }
        } else {
            System.out.println("未找到要借阅的书籍!!!");
        }

    }
}
