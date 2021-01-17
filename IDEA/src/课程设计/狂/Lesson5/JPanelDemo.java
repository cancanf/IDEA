package 课程设计.狂.Lesson5;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {

    public JPanelDemo() {
        //container是Frame的父类
//        Container container = this.getContentPane();
//
//        container.setLayout(new GridLayout(2,1,10,10));
        JFrame jFrame = new JFrame("无");
        jFrame.setLayout(new GridLayout(2, 1, 10, 100));//横间距为10,纵间距为100

        JPanel panel1 = new JPanel(new GridLayout(1, 3));
        JPanel panel2 = new JPanel(new GridLayout(1, 2));
        JPanel panel3 = new JPanel(new GridLayout(2, 1));
        JPanel panel4 = new JPanel(new GridLayout(3, 2));

        panel1.add(new JButton("1"));
        panel1.add(new JButton("1"));
        panel1.add(new JButton("1"));
        panel2.add(new JButton("2"));
        panel2.add(new JButton("2"));
        panel3.add(new JButton("3"));
        panel3.add(new JButton("3"));
        panel4.add(new JButton("4"));
        panel4.add(new JButton("4"));
        panel4.add(new JButton("4"));
        panel4.add(new JButton("4"));
        panel4.add(new JButton("4"));
        panel4.add(new JButton("4"));


        jFrame.add(panel1);
        jFrame.add(panel2);
        jFrame.add(panel3);
        jFrame.add(panel4);
//        container.add(panel);
        jFrame.setVisible(true);
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JPanelDemo();
    }
}
