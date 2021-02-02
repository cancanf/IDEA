package 课堂代码.顺序表和链表;

class MyArrayListIndexOutOfRangeException extends RuntimeException {
    public MyArrayListIndexOutOfRangeException(String message) {
        super(message);
    }
}

public class MyArrayList {

    private String[] date = null;
    //当前容量
    private int size = 0;
    //最大容量
    private int capacoty = 100;

    public MyArrayList() {
        this.date = new String[capacoty];
    }

    //增删改查方法
    private void realloc() {

    }


}
