package 课堂代码.BooKSystem.operation;

import 课堂代码.BooKSystem.BookList;

public class DisplayOperation implements IOperation {
    //显示书籍列表
    @Override
    public void work(BookList bookList) {
        for (int i = 0; i < bookList.getSize(); i++) {
            System.out.println(bookList.getBooks(i).toString());
        }
    }
}
