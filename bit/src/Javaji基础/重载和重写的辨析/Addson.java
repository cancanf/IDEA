package Javaji基础.重载和重写的辨析;

public class Addson extends Add{
    public Addson(int a) {
        super(a);
    }

    public void print(){
       System.out.println("方法重写了");
    }
}
