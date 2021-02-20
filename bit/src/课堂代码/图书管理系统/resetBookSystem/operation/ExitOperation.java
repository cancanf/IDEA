package 课堂代码.图书管理系统.resetBookSystem.operation;


import 课堂代码.图书管理系统.resetBookSystem.Book;
import 课堂代码.图书管理系统.resetBookSystem.BookList;

import java.io.*;

//保存数据并退出程序
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Book end = bookList.getBooks();
        end = end.nextbook;
        File file = new File("bit/src/课堂代码/图书管理系统/resetBookSystem/BookDate.txt");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            while (end != null) {
                writer.write(end.getName() + "\t" + end.getAuthor() + "\t" + end.getPrice() + "\t" + end.getType() + "\t" + end.isBorrowed() + "\n");
                end = end.nextbook;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("程序退出!!!  ");
        System.exit(0);
    }
}
