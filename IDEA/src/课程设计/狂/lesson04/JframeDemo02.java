package 课程设计.狂.lesson04;

import javax.swing.*;
import java.awt.*;

public class JframeDemo02 {
    public void init() {
        //顶级窗口
        JFrame jf = new JFrame("第二次输入");

        jf.setVisible(true);
        jf.setBounds(10, 10, 200, 200);
        //设置文字
        JLabel label = new JLabel("第二次了啊");
        jf.add(label);
        //文本框居中
        label.setHorizontalAlignment(SwingConstants.CENTER);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //获得一个容器,设置颜色
        Container container = jf.getContentPane();
        container.setBackground(Color.yellow);
    }

    public static void main(String[] args) {
        new JframeDemo02().init();
    }
}


