package 课程设计.ball.ball2;

import javax.swing.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

class ListenerFrame extends JFrame implements KeyListener, MouseMotionListener {
    /**
     * @param DEFAULT_WIDTH 组件宽
     * @param DEFAULT_HEIGHT 组件高度
     */
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;
    int x;
    //创建 挡板和球对象
    private Paddle paddle = new Paddle();
    private Ball ball = new Ball();

    // 创建画图对象，传入构造方法
    private MyComponent component = new MyComponent(ball, paddle);

    public ListenerFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        add(component);

        //定时器 定时重绘组件
        java.util.Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                component.repaint();
                ball.move();
                ball.collide(paddle.getX(), paddle.getY(), paddle.PADDLE_WIDTH, paddle.PADDLE_HEIGHT);

            }
        }, 0, 1000 / 45);

    }

    //键盘监听
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                paddle.moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                paddle.moveRight();
                break;

            case KeyEvent.VK_A:
                paddle.moveLeft();
                break;
            case KeyEvent.VK_D:
                paddle.moveRight();
                break;
            case KeyEvent.VK_F:
                ball.fire();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        paddle.setX(e.getX());
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
