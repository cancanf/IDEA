package 课程设计.ball.ball2;

import java.awt.*;

public class Ball {
    /**
     * @param BALL_WIDTH 球宽度
     * @param BALL_HEIGHT 球高度
     */
    private static final int BALL_WIDTH = 25;
    private static final int BALL_HEIGHT = 25;

    private int x = 175;
    private int y = 100;
    private int speedX = 8;
    private int speedY = 8;
    private boolean fired = false;

    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //抗锯齿
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawOval(x, y, BALL_WIDTH, BALL_HEIGHT);
    }

    public void fire() {
        fired = true;
    }

    public void move() {
        if (fired) {
            if (x <= 0 || x >= 400)
                speedX *= -1;
            if (y <= 0 || y >= 400)
                speedY *= -1;
            x += speedX;
            y += speedY;
        }
    }

    public void collide(int x, int y, int width, int height) {
        if (this.x >= x && this.x <= x + width) {
            if (this.y + BALL_HEIGHT > y && this.y < y + height) {
                //与球碰撞
                speedY *= -1;
            }
        }
    }
}
