package 课程设计.课程贪吃蛇;

import javax.swing.*;
import java.net.URL;

//数据中心
public class Date {
    public static URL bodyURL = Date.class.getResource("body.png");
    public static URL foodRUL = Date.class.getResource("food.png");
    public static URL leftURL = Date.class.getResource("left.png");
    public static URL rightURL = Date.class.getResource("right.png");
    public static URL upURL = Date.class.getResource("up.png");
    public static URL downURL = Date.class.getResource("down.png");

    public static ImageIcon body = new ImageIcon(bodyURL);
    public static ImageIcon food = new ImageIcon(foodRUL);
    public static ImageIcon left = new ImageIcon(leftURL);
    public static ImageIcon right = new ImageIcon(rightURL);
    public static ImageIcon up = new ImageIcon(upURL);
    public static ImageIcon down = new ImageIcon(downURL);
}
