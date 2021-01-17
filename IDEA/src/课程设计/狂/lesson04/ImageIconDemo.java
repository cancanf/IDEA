package 课程设计.狂.lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {

    public ImageIconDemo() {
        JLabel label = new JLabel("ImageIcon");
        URL url = ImageIconDemo.class.getResource("met.jpg");//点的问题,建议复制

        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();//容器类
        container.add(label);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 200, 200);
    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
