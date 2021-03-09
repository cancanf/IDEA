package 课堂代码.课后作业.图书管理系统.BooKSystem;

public class BookList {

    private Book[] books = new Book[100];//100作为数组的最大上限也相当于BookList的 capacity
    private int size = 0; //size作为当前书籍总数

    //空参构造方法用于Main类中创建BookList时候初始化书籍数据
    public BookList() {
        books[0] = new Book("三国演义", "罗贯中", 100, "古典小说");
        books[1] = new Book("西游记", "吴承恩", 100, "古典小说");
        books[2] = new Book("金瓶梅", "兰陵笑笑生", 110, "古典小说");
        size = 3;
    }

    //书籍数据为private,在其他类无法进行直接操作所以我们要创建public方法对本类书籍数据进行操作


    public Book getBooks(int index) {
        return books[index];
    }

    public void setBooks(int index, Book book) {
        books[index] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
