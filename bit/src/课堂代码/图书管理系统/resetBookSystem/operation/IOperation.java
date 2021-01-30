package 课堂代码.图书管理系统.resetBookSystem.operation;


import 课堂代码.图书管理系统.resetBookSystem.BookList;

public interface IOperation {
    //使用这个接口的主要原因是因为
    void work(BookList bookList);

}
