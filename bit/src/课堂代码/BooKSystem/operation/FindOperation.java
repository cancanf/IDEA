package 课堂代码.BooKSystem.operation;

import 课堂代码.BooKSystem.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {
    //查找书籍信息
    @Override
    public void work(BookList bookList) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要查找的书籍的名字:  ");
        String name = in.next();
        int i = 0;
        for (i = 0; i < bookList.getSize(); i++) {
            if ((bookList.getBooks(i).getName()).contains(name)) {//模糊查询,输入关键字就可以查到.但是只能查到第一个.
                System.out.println(bookList.getBooks(i));
            }
        }
    }
}
