package 课程设计.课程贪吃蛇;

import javax.swing.*;

public class StarGame {
    public static void main(String[] args) {
        //new一个框架
        JFrame frame = new JFrame();
        //设置尺寸和初始位置
        frame.setBounds(100, 100, 900, 720);
        //设置是否能缩放
        frame.setResizable(false);
        //关闭方法
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //一个GanmePanel类放入frame框架
        frame.add(new GamePanel());
        //设置可见性
        frame.setVisible(true);
    }
}
