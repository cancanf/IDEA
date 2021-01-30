package 课堂代码.图书管理系统.resetBookSystem.operation;

import 课堂代码.图书管理系统.resetBookSystem.Book;
import 课堂代码.图书管理系统.resetBookSystem.BookList;

public class FindBook {

    public Book findbook(String name, BookList bookList) {
        Book end = bookList.getBooks().nextbook;

        while (end != null) {
            if (end.getName().equals(name)) {
                return end;
            }
            end = end.nextbook;
        }
        return null;
    }

    public Book findbeforebook(String book, BookList bookList) {
        Book end = bookList.getBooks().nextbook;
        Book endbefore = bookList.getBooks();
        while (end != null) {
            if (end.getName().equals(book)) {
                return endbefore;
            }
            end = end.nextbook;
            endbefore = endbefore.nextbook;
        }
        return null;
    }
}
