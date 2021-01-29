package 寒假作业.day08;

import java.awt.AWTException;

import java.awt.GridLayout;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class qmq extends JFrame implements KeyListener {
    JLabel text = new JLabel("F11");

    qmq() {
        setTitle("qmq");
        setLayout(new GridLayout(1, 1));
        setSize(500, 200);
        add(text);
        setVisible(true);
        addKeyListener(this);
    }

    Timer timer = new Timer(500, new Click());

    @Override
    public void keyPressed(KeyEvent arg0) {
        // TODO 自动生成的方法存根

    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO 自动生成的方法存根
        Thread t = new Thread();
        if (arg0.getKeyCode() == KeyEvent.VK_F11) {//按下F11开始点击
            try {
                timer.start();
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.print("按下了F11");
        } else if (arg0.getKeyCode() == KeyEvent.VK_F12) {//按下F12停止点击
            System.out.print("按下了F12");
            timer.stop();
        }

    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO 自动生成的方法存根

    }

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        new qmq();
    }

    public class Click implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO 自动生成的方法存根
            try {
                Robot rb = new Robot();
                rb.mousePress(KeyEvent.BUTTON1_MASK);
                rb.mouseRelease(KeyEvent.BUTTON1_MASK);
            } catch (AWTException e1) {
                // TODO 自动生成的 catch 块
                e1.printStackTrace();
            }
        }

    }
}
