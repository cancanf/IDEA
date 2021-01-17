package 课程设计.狂.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestAction02 {
    public static void main(String[] args) {
        //两个按钮实现一个监听
        Frame frame = new Frame();
        Button button1 = new Button("start");
        Button button2 = new Button("stop");
        frame.add(button1, BorderLayout.WEST);
        frame.add(button2, BorderLayout.EAST);
        frame.pack();
        frame.setVisible(true);
        MyMinitor myMinitor = new MyMinitor();
        //可以显示的定义除法会返回的命令,如果不现实定义,则显示默认的值.
        button2.setActionCommand("1");
        button1.addActionListener(myMinitor);
        button2.addActionListener(myMinitor);


    }
}

class MyMinitor implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("点击了按钮,输出了" + e.getActionCommand());
        if (e.getActionCommand().equals("start")) {

        } else {

        }
    }
}