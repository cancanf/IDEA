package 课堂代码.课后作业.图书管理系统.resetBookSystem.operation;

import 课堂代码.课后作业.图书管理系统.resetBookSystem.BookList;

public class DisplayOperation implements IOperation {
    //显示书籍列表
    @Override
    public void work(BookList bookList) {
        bookList.display();
    }
}
