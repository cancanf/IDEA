package 课程设计.狂.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExDemo {
    public static void main(String[] args) {
        //框架属性
        Frame frame = new Frame("第一个程序 ");
        frame.setSize(910, 540);
        frame.setLocation(910, 540);
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2, 1));
        //面板
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2, 1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2, 2));

        p1.add(new Button("East-1"), BorderLayout.EAST);
        p1.add(new Button("West-1"), BorderLayout.WEST);
        p2.add(new Button("p2=btn-1"));
        p2.add(new Button("p2=btn-2"));
        p1.add(p2, BorderLayout.CENTER);
        p3.add(new Button("East-1"), BorderLayout.EAST);
        p3.add(new Button("West-1"), BorderLayout.WEST);
        p4.add(new Button("p2-btn-1"));
        p4.add(new Button("p2-btn-2"));
        p4.add(new Button("p2-btn-3"));
        p4.add(new Button("p2-btn-4"));
        p3.add(p4, BorderLayout.CENTER);

        frame.add(p1);
        frame.add(p3);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }
}
