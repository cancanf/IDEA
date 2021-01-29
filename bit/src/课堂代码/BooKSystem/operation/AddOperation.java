package 课堂代码.BooKSystem.operation;

import 课堂代码.BooKSystem.Book;
import 课堂代码.BooKSystem.BookList;

import java.util.Scanner;

//向BookList添加新的书籍
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner in = new Scanner(System.in);
        //新增数据
        System.out.println("新增书籍");
        System.out.println("输入新的书籍名称:  ");
        String name = in.next();
        System.out.println("输入新的书籍作者:  ");
        String author = in.next();
        System.out.println("输入新的书籍价格:  ");
        double price = in.nextDouble();
        System.out.println("输入新的书籍类别:  ");
        String type = in.next();
        //添加书籍到末尾
        bookList.setBooks(bookList.getSize(), new Book(name, author, price, type));
        bookList.setSize(bookList.getSize() + 1);
        System.out.println("新增书籍成功 ");

    }

}
