package java课.实验七异常处理;

import java.util.Scanner;

public class Circle {
    private double R;

    Scanner in = new Scanner(System.in);

    public Circle() {
    }

    public Circle(double r) {

        boolean ok = true;
        while (ok) {
            try {
                if (r < 0) {
                    throw new MyException("半径为负");
                } else {
                    ok = false;
                }
            } catch (MyException e) {
                e.printStackTrace();
                System.out.println("请重新输入: ");
                r = in.nextDouble();
            }
            this.R = r;
        }
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        if (r < 0) {
            try {
                throw new MyException("半径为负");
            } catch (MyException e) {
                e.printStackTrace();
            }
        } else {
            R = r;
        }
    }


    public void area() {
        System.out.println("圆的面积为: " + Math.PI * Math.pow(this.R, 2));
    }

    public void perimeter() {
        System.out.println("圆的周长为: " + 2 * Math.PI * this.R);
    }
}
