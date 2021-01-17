package 课程设计.狂.lesson06;

import javax.swing.*;
import java.awt.*;

public class TextTextDemo04 extends JFrame {
    public TextTextDemo04() throws HeadlessException {
        //下拉选择框
        Container container = this.getContentPane();
        // 密码框
        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setEchoChar('*');

        container.add(jPasswordField);

        setVisible(true);
        setSize(500, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TextTextDemo04();
    }
}
