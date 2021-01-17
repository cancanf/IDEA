package 课程设计.狂.lesson06;

import javax.swing.*;
import java.awt.*;

public class TextTextDemo03 extends JFrame {
    public TextTextDemo03() throws HeadlessException {
        //下拉选择框
        Container container = this.getContentPane();

        JTextField textField1 = new JTextField("hello");
        JTextField textField2 = new JTextField("world", 20);
        container.add(textField1, BorderLayout.SOUTH);
        container.add(textField2, BorderLayout.NORTH);

        setVisible(true);
        setSize(500, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TextTextDemo03();
    }
}
