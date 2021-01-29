package 课堂代码.resetBookSystem.operation;

import 课堂代码.resetBookSystem.Book;
import 课堂代码.resetBookSystem.BookList;

import java.util.Scanner;

public class DelOperation extends FindBook implements IOperation {
    //进行删除指定书籍的操作
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要删除的书籍名: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();

        Book beforebook = findbeforebook(name, bookList);
        Book nextbook = beforebook.nextbook.nextbook;
        if (beforebook != null) {
            beforebook.nextbook = nextbook;
        } else {
            System.out.println("未找到要删除的书籍!!!");
        }
        System.out.println("删除成功");
    }
}
