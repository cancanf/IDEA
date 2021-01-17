package 课程设计.狂.Lesson5;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo01 extends JFrame {
    public JButtonDemo01() throws HeadlessException {
        Container contentPane = this.getContentPane();
        //将一个图片变为图标
        URL resource = JButtonDemo01.class.getResource("met.jpg");
        Icon icon = new ImageIcon(resource);//

        //吧图标放在按钮上
        JButton button = new JButton();
        button.setIcon(icon);
        //在指针悬浮上时候
        button.setToolTipText("不要点");
        //add
        contentPane.add(button);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500, 300);
    }

    public static void main(String[] args) {
        new JButtonDemo01();

    }
}
