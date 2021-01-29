package Javaji基础.重载和重写的辨析;


public class Text {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int aa,int bb ,int cc){
        return aa+bb+cc;
    }
    public double add(int a,double b){
        return (double)a+b;
    }
    public double add(double a,int b){
        return a+(double)b;
    }
    public double add(double a, double b , double c){
        return a+b+c;
    }
    public static void main(String[] args)   {
        //方法重载
        Text text = new Text();
        System.out.println(text.add(10,20));
        System.out.println(text.add(10,20,30));
        System.out.println(text.add(10,10.1));
        System.out.println(text.add(10.1,10));
        System.out.println(text.add(10.1,20.4,30.4));
        /*
        30
        60
        20.1
        20.1
        60.9
        * */
    }
}
