package 课程设计.狂.Lesson5;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JbuttonDemo02 extends JFrame {
    public JbuttonDemo02() throws HeadlessException {
        Container contentPane = this.getContentPane();
        //将一个图片变为图标
        URL resource = JButtonDemo01.class.getResource("met.jpg");
        Icon icon = new ImageIcon(resource);//

        //单选框,不能同时选中,因此要分组
        JRadioButton radioButton1 = new JRadioButton("单选框1");
        JRadioButton radioButton2 = new JRadioButton("单选框2");
        JRadioButton radioButton3 = new JRadioButton("单选框3");
        //按钮组
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        contentPane.add(radioButton1, BorderLayout.NORTH);
        contentPane.add(radioButton2, BorderLayout.CENTER);
        contentPane.add(radioButton3, BorderLayout.SOUTH);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500, 300);
    }

    public static void main(String[] args) {
        new JbuttonDemo02();

    }
}
