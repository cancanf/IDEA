package 课程设计.狂.lesson01;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        //窗口标题
        Frame frame = new Frame("第一个java窗口");
        //窗口可见性
        frame.setVisible(true);
        //窗口大小
        frame.setSize(400, 400);
        //背景颜色
        frame.setBackground(new Color(211, 80, 80));
        //弹出的初始位置
        frame.setLocation(1920 / 2, 1080 / 2);
        //设置大小固定
        frame.setResizable(false);
    }
}
