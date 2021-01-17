package 课程设计.ball.ball2;

import java.awt.*;

public class Paddle {
    /**
     * @param PADDLE_WIDTH 挡板宽度
     * @param PADDLE_HEIGHT 挡板高度
     */
    public static final int PADDLE_WIDTH = 125;
    public static final int PADDLE_HEIGHT = 25;

    private int x = 125;
    private int y = 300;
    private int speed = 15;

    //绘图
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
    }

    public void moveLeft() {
        if (x > 0)
            x -= speed;
    }

    public void moveRight() {
        if (x < 400 - PADDLE_WIDTH)
            x += speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int mouseX) {
        this.x = mouseX;
    }

    public int getY() {
        return y;
    }
}
