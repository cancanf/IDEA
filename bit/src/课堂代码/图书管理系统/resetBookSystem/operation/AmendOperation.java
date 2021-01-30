package 课堂代码.图书管理系统.resetBookSystem.operation;

import 课堂代码.图书管理系统.resetBookSystem.Book;
import 课堂代码.图书管理系统.resetBookSystem.BookList;

import java.util.Scanner;

//修改书籍信息
public class AmendOperation extends FindBook implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要修改的书籍名: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        Book findbook = findbook(name, bookList);
        if (findbook != null) {
            System.out.println("请输入要修改的项目: ");
            System.out.println("1.修改书籍名");
            System.out.println("2.修改书籍作者");
            System.out.println("3.修改书籍价格");
            System.out.println("4.修改书籍类型");
            System.out.println("5.修改书籍全部数据");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("请输入要修改的书名");
                    findbook.setName(in.next());
                    break;
                case 2:
                    System.out.println("请输入要修改的作者名");
                    findbook.setAuthor(in.next());
                    break;
                case 3:
                    System.out.println("请输入要修改的书籍价格");
                    findbook.setPrice(in.nextDouble());
                    break;
                case 4:
                    System.out.println("请输入要修改的书籍类型");
                    findbook.setType(in.next());
                    break;
                case 5:
                    System.out.println("请依次输入要修改的所有数据");
                    System.out.println("请输入书籍名:  ");
                    String setname = in.next();
                    System.out.println("请输入书籍作者:  ");
                    String author = in.next();//书籍作者
                    System.out.println("请输入书籍价格:  ");
                    double price = in.nextDouble();//书籍价格
                    System.out.println("请输入书籍类型:  ");
                    String type = in.next();//书籍类型
                    findbook.setAll(setname, author, price, type);
                    break;
            }
        } else {
            System.out.println("未查询到要修改的书籍!!!");
        }
    }
}
