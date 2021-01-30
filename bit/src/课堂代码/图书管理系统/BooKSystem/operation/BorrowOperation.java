package 课堂代码.图书管理系统.BooKSystem.operation;

import 课堂代码.图书管理系统.BooKSystem.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    //实现借书的操作
    @Override
    public void work(BookList bookList) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要借阅书籍的名字:  ");
        String name = in.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if ((bookList.getBooks(i).getName()).equals(name)) {
                break;
            }
        }
        if (i >= bookList.getSize()) {
            System.out.println("输入的书籍[ " + name + " ]未找到,借阅失败!");
        } else if (i < bookList.getSize()) {
            if (!bookList.getBooks(i).isBorrowed()) {
                bookList.getBooks(i).setBorrowed(true);
                System.out.println("借书成功!");
            } else {
                System.out.println("书籍已经被借走,请下次再来 !");
            }
        }

    }
}
