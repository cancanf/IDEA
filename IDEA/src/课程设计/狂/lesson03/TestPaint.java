package 课程设计.狂.lesson03;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        MyPaint myPaint = new MyPaint();
        myPaint.loadFrame();

    }
}

class MyPaint extends Frame {
    public void loadFrame() {
        setVisible(true);
        setBounds(200, 200, 600, 500);

    }

    //画笔
    @Override
    public void paint(Graphics g) {
        //画笔,有颜色,可以画.
        g.setColor(Color.blue);
        g.drawOval(100, 100, 100, 100);
        g.fillOval(200, 100, 100, 100);
        g.setColor(Color.yellow);
        g.fillRect(50, 50, 50, 50);
        //习惯,画笔用完,还原到最初的颜色;


    }
}
