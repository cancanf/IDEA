package 课程设计.ball.last;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //在主类中新建一个框架并设置属性
        JFrame frame = new JFrame("打砖块");
        frame.setResizable(false);
        //不可缩放
        frame.setBounds(300, 200, 700, 700);
        //窗口大小
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //用于关闭
        frame.add(new BallPanel());
        //新建BallFrame类并加入框架
        frame.setVisible(true);
        //设置可见性

    }
}
