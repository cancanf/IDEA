package 课程设计.ball.ballNew;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ball extends JPanel implements ActionListener {
    Timer time = new Timer(100, this);
    int ballx, bally,
            ballx_v, bally_v;
    int mousex, mousey;

    public void init() {
        ballx = 20;
        bally = 20;
        ballx = 20;
        bally = 20;
    }

    //画图
    public Ball() {
        init();
        //监听器
        time.start();

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                mousex = e.getX();
                mousey = e.getY();
                repaint();
            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
            }
        });


    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(ballx, bally, 15, 15);
        g.setColor(Color.blue);
        g.fillRect(mousex - 50, mousey, 100, 20);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ballx += ballx_v;
        bally += bally_v;
        repaint();
    }
}


//
//public class Mouse implements MouseMotionListener {
//
//    @Override
//    public void mouseDragged(MouseEvent e) {
//
//    }
//
//    @Override
//    public void mouseMoved(MouseEvent e) {
//       mousex =  e.getX();
//       mousey =  e.getY();
//       repaint();
//    }
//}




