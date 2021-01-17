package java课.实验七异常处理;

import java.util.Scanner;

public class Rectangle {

    private double longer;
    private double wide;

    public Rectangle() {
    }

    public Rectangle(double longer, double wide) {

        Scanner in = new Scanner(System.in);
        boolean ok = true;
        while (ok) {
            try {
                if (longer < 0 && wide < 0) {
                    throw new MyException("传入的长度和宽度都小于0");
                } else if (wide < 0) {
                    throw new MyException("传入的宽度小于0");
                } else if (longer < 0) {
                    throw new MyException("传入的长度小于0");
                } else {
                    ok = false;
                }
            } catch (MyException e) {
                e.printStackTrace();
                System.out.println("请依次重新输入矩形的长和宽 ");
                longer = in.nextDouble();
                wide = in.nextDouble();
            }
            this.longer = longer;
            this.wide = wide;
        }
    }

    public double getLonger() {
        return longer;
    }

    public void setLonger(double longer) {
        this.longer = longer;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public void area() {
        System.out.println("矩形的面积为: " + this.longer * this.wide);
    }

    public void perimeter() {
        System.out.println("矩形的周长为: " + 2 * (this.longer + this.wide));
    }
}
