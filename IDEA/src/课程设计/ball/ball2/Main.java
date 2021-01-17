package 课程设计.ball.ball2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // 事件分配线程写法来自Java Core 1（408页）
        // 没有记错的话这个是Java 8里的lambda表达式
        EventQueue.invokeLater(() -> {
            //创建对象
            ListenerFrame frame = new ListenerFrame();
            //添加关闭按钮
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //添加Title
            frame.setTitle("打砖块");
            //添加键盘监听事件
            frame.addKeyListener(frame);
            //设置可见
            frame.setVisible(true);
        });
    }
}
