package 课程设计.狂.lesson01;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.blue);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.yellow);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.blue);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.blue);
    }
}

class MyFrame extends Frame {
    static int id = 0;//计数器,

    public MyFrame(int x, int y, int w, int h, Color color) {

        super("Myframe +" + (++id));
        setBackground(color);
        setBounds(x, y, w, h);
        setVisible(true);
    }
}
