package 课堂代码.resetBookSystem;

import java.io.*;


public class BookList {

    private Book books;

    public BookList() {
        this.books = new Book();
        init();
    }

    public void addBook(String name, String author, double price, String type) {
        Book endbook = books;
        Book newbook = new Book(name, author, price, type);
        while (endbook.nextbook != null) {
            endbook = endbook.nextbook;
        }
        endbook.nextbook = newbook;
        endbook = newbook;

    }


    public void init() {
        File file = new File("D:\\JAVA\\IDEA项目\\bit\\src\\课堂代码\\resetBookSystem\\BookDate.txt");

        BufferedReader reader = null;
        Book endbook = books;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = reader.readLine();
            while (tempString != null) {
                //进行分割
                String[] split = tempString.split("\t");
                //循环遍历初始化数据
                Book newbook = new Book(split[0], split[1], Double.parseDouble(split[2]), split[3]);
                while (endbook.nextbook != null) {
                    endbook = endbook.nextbook;
                }
                endbook.nextbook = newbook;
                endbook = newbook;

                tempString = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public void display() {
        //输出所有书籍
        Book endbook = books.nextbook;
        System.out.println("====================================");
        while (endbook != null) {
            System.out.println(endbook.toString());
            endbook = endbook.nextbook;
        }
        System.out.println("====================================");

    }

    public Book getBooks() {
        return books;
    }

    public void setBooks(Book books) {
        this.books = books;
    }


}
