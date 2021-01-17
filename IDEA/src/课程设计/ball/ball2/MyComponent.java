package 课程设计.ball.ball2;

import javax.swing.*;
import java.awt.*;

class MyComponent extends JComponent {
    //初始化
    private Ball ball = null;
    private Paddle paddle = null;

    // 获取对象
    public MyComponent(Ball ball, Paddle paddle) {
        this.ball = ball;
        this.paddle = paddle;
    }

    //调用画图
    public void paintComponent(Graphics g) {

        ball.draw(g);
        paddle.draw(g);
    }

    @Override
    public Dimension getPreferredSize() {
        return super.getPreferredSize();
    }

}
