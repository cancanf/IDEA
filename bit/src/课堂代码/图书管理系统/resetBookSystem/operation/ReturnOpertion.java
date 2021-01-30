package 课堂代码.图书管理系统.resetBookSystem.operation;

import 课堂代码.图书管理系统.resetBookSystem.Book;
import 课堂代码.图书管理系统.resetBookSystem.BookList;

import java.util.Scanner;

public class ReturnOpertion extends FindBook implements IOperation {
    //实现还书操作
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入归还的书籍名: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        Book findbook = findbook(name, bookList);
        if (findbook != null) {
            if (findbook.isBorrowed()) {
                findbook.setBorrowed(false);
                System.out.println("归还成功!");
            } else {
                System.out.println("书籍未被借出.");
            }
        } else {
            System.out.println("未找到要归还的书籍!!!");
        }
    }
}
