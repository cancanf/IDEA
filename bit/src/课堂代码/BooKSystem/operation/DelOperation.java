package 课堂代码.BooKSystem.operation;

import 课堂代码.BooKSystem.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    //进行删除指定书籍的操作
    @Override
    public void work(BookList bookList) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要删除书籍的名字:  ");
        String name = in.next();
        int i = 0;
        for (i = 0; i < bookList.getSize(); i++) {
            if ((bookList.getBooks(i).getName()).equals(name)) {
                break;
            }
        }
        //这种删除方式,删除之后内存会占用吗?
        if (i >= bookList.getSize()) {
            System.out.println("输入的书籍[ " + name + " ]未找到,删除失败!");
        }
        if (i == bookList.getSize() - 1) {
            bookList.setBooks(i, null);//让被删除的不被指向,过一会被jvm自动回收
            bookList.setSize(bookList.getSize() - 1);
        }
        if (i < bookList.getSize()) {
            bookList.setBooks(i, bookList.getBooks(bookList.getSize() - 1));
            bookList.setBooks(bookList.getSize() - 1, null);
            bookList.setSize(bookList.getSize() - 1);
        }
        System.out.println("删除成功");
    }
}
