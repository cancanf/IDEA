package 课程设计.狂.Lesson5;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {
    public JScrollDemo() {

        Container contentPane = this.getContentPane();

        JTextArea text = new JTextArea(20, 50);
        text.setText("欢迎僧费等勘察费");

        //Scroll面板
        JScrollPane scrollPane = new JScrollPane(text);
        contentPane.add(scrollPane);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 300, 300);

    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}
