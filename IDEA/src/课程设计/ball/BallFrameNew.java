package 课程设计.ball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


public class BallFrameNew extends JFrame {
    public static void main(String[] args) {
        new BallFrameNew();
    }

    int ballX;
    int ballY;
    int Mouse_X;
    int Mouse_Y;
    int ballX_V;
    int ballY_V;

    JPanel GamePanel; // 游戏界面

    public BallFrameNew() {
        setTitle("弹球游戏"); // 设置Frame标题
        setLayout(new BorderLayout()); // 设置布局方法
        setResizable(false); // 设置窗口大小不可改变
        setVisible(true);
        setBounds(300, 200, 600, 300); // 设置Frame大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置默认关闭事件

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                Mouse_X = getX();
                Mouse_Y = getY();
                repaint();
            }
        });

        GamePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics point = g;
                point.setColor(Color.RED); // 设置点的颜色
                point.fillOval(ballX, ballY, 15, 15); // 设置球的位置和大小
                g.setColor(new Color(80, 80, 200)); // 设置板子的颜色
                g.fillRect(Mouse_X - 50, 215, 100, 10); // 设置板子的位置大小
            }
        };

    }

    public void init() {
        ballX = 10;
        ballY = 20;
        GamePanel.repaint();
    }
}
