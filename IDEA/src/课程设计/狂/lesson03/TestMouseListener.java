package 课程设计.狂.lesson03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图软件");
    }
}

class MyFrame extends Frame {
    ArrayList points;
    //画画需要监听鼠标位置,需要一个集合来存储这个点.

    public MyFrame(String title) {
        super(title);
        setBounds(500, 500, 1000, 1000);
        //存鼠标的坐标
        points = new ArrayList<>();
        this.addMouseListener(new MyMouseListener());
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {

        Iterator iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = (Point) iterator.next();
            g.setColor(Color.BLACK);
            g.fillOval(point.x, point.y, 50, 50);
        }
    }

    public void addPaint(Point point) {
        points.add(point);
    }

    private class MyMouseListener extends MouseAdapter {
        //鼠标有按下,弹起,按住

        @Override
        public void mousePressed(MouseEvent e) {
            //拿到了窗口
            MyFrame myFrame = (MyFrame) e.getSource();
            //再点击的时候,在界面上产生一个点
            //这个点就是鼠标的点
            myFrame.addPaint(new Point(e.getX(), e.getY()));
            //要求每次点击鼠标都要重画一次
            myFrame.repaint();

        }
    }
}