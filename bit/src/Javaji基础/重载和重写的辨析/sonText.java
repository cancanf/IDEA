package Javaji基础.重载和重写的辨析;

public class sonText {
    public static void main(String[] args) {
        Add add = new Add(1);
        Addson addson = new Addson(2);
        add.print();
        addson.print();
    }
}
