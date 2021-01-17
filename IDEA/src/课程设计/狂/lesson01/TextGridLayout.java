package 课程设计.狂.lesson01;

import java.awt.*;

public class TextGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("TestBorderLayout");

        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");
        Button btn4 = new Button("btn4");
        Button btn5 = new Button("btn5");
        //棋盘布局
        frame.setLayout(new GridLayout(3, 2));

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);

        frame.pack();
        frame.setVisible(true);


    }
}
