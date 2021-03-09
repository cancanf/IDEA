package 课堂代码.课后作业.图书管理系统.BooKSystem.operation;

import 课堂代码.课后作业.图书管理系统.BooKSystem.BookList;

public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("程序退出!!!  ");
        System.exit(0);
    }
}
