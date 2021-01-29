package 课堂代码.BooKSystem.operation;

import 课堂代码.BooKSystem.BookList;

import java.util.Scanner;

public class ReturnOpertion implements IOperation {
    //实现还书操作
    @Override
    public void work(BookList bookList) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要返还书籍的名字:  ");
        String name = in.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if ((bookList.getBooks(i).getName()).equals(name)) {
                break;
            }
        }
        if (i >= bookList.getSize()) {
            System.out.println("输入的书籍[ " + name + " ]未找到,归还失败!");
        } else if (i < bookList.getSize()) {
            if (bookList.getBooks(i).isBorrowed()) {
                bookList.getBooks(i).setBorrowed(false);
                System.out.println("还书成功!");
            } else {
                System.out.println("书籍没有借出,无法归还!");
            }
        }

    }
}
