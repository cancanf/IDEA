package 课程设计.狂.Lesson5;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo03 extends JFrame {
    public JButtonDemo03() throws HeadlessException {
        Container contentPane = this.getContentPane();
        //将一个图片变为图标
        URL resource = JButtonDemo01.class.getResource("met.jpg");
        Icon icon = new ImageIcon(resource);//

        JCheckBox checkBox1 = new JCheckBox("第一个多选");
        JCheckBox checkBox2 = new JCheckBox("第二个多选");

        contentPane.add(checkBox1, BorderLayout.NORTH);
        contentPane.add(checkBox2, BorderLayout.SOUTH);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500, 300);
    }

    public static void main(String[] args) {
        new JButtonDemo03();

    }
}
