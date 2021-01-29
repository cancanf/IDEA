package 课堂代码.resetBookSystem.operation;

import 课堂代码.resetBookSystem.Book;
import 课堂代码.resetBookSystem.BookList;

import java.util.Scanner;

//向BookList添加新的书籍
public class AddOperation extends FindBook implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入书籍名:  ");
        String name = in.next();
        System.out.println("请输入书籍作者:  ");
        String author = in.next();//书籍作者
        System.out.println("请输入书籍价格:  ");
        double price = in.nextDouble();//书籍价格
        System.out.println("请输入书籍类型:  ");
        String type = in.next();//书籍类型
        bookList.addBook(name, author, price, type);
        System.out.println("成功添加书籍名为" + name + "的书籍");
    }

}
