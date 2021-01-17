package 课程设计.狂.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setBounds(300, 300, 500, 500);
        frame.setBackground(Color.RED);
        //组件按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        button1.setBackground(Color.blue);
        //设置为流式布局
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setSize(200, 200);

        //
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }
}
