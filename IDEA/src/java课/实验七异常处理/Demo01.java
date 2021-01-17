package java课.实验七异常处理;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        double a, b;
        double r;
        Scanner in = new Scanner(System.in);
        System.out.println("输入矩形的长和宽 : ");
        a = in.nextDouble();
        b = in.nextDouble();
        Rectangle rectangle = new Rectangle(a, b);
        rectangle.area();
        rectangle.perimeter();

        System.out.println("=============================");
        System.out.println("输入圆的半径 : ");
        r = in.nextDouble();
        Circle circle = new Circle(r);
        circle.area();
        circle.perimeter();
    }
}
