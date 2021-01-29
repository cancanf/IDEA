package 课堂代码.resetBookSystem.operation;

import 课堂代码.resetBookSystem.BookList;

public class DisplayOperation implements IOperation {
    //显示书籍列表
    @Override
    public void work(BookList bookList) {
        bookList.display();
    }
}
