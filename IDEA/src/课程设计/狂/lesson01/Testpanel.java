package 课程设计.狂.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Testpanel {
    public static void main(String[] args) {
        Panel panel = new Panel();
        Frame frame = new Frame();
        //设置布局
        frame.setLayout(null);
        //坐标
        frame.setBounds(300, 300, 500, 500);
        frame.setBackground(new Color(107, 187, 84));
        //相对于frame对panel设置坐标
        panel.setBounds(50, 50, 400, 400);
        panel.setBackground(new Color(203, 20, 67));

        frame.add(panel);
        frame.setVisible(true);
        //监听事件,监听窗口关闭时间;
        frame.addWindowListener(new WindowAdapter() {//适配器模式
            //再窗口点击挂壁的时候做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                //结束程序
                System.exit(0);
            }
        });
    }
}
