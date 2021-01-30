package 课堂代码.图书管理系统.resetBookSystem.operation;


import 课堂代码.图书管理系统.resetBookSystem.Book;
import 课堂代码.图书管理系统.resetBookSystem.BookList;

import java.util.Scanner;


public class FindOperation extends FindBook implements IOperation {
    //查找书籍信息
    @Override
    public void work(BookList bookList) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要查找的书籍名!");
        String name = in.next();
        Book findbook = findbook(name, bookList);
        if (findbook != null) {
            System.out.println(findbook.toString());
        } else {
            System.out.println("没有在库里查找到所需要的书籍");
        }
    }

}
