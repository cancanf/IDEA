package 课程设计.ball.last;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class BallPanel extends JPanel implements ActionListener, KeyListener {

    /**
     * 球的状态
     */
    int ballX;
    int ballY;
    int ballXV;
    int ballYV;
    boolean ballcolor;

    //板子(鼠标)状态
    int Mouse_X;
    int Mouse_Y;
    boolean Mouse_Color;


    boolean isStart;
    boolean isFail;

    //随机数
    Random random;

    //砖块类数组
    zhuan[] zhuan;
    final int wide = 100;
    final int high = 30;

    Timer timer = new Timer(10, this);

    //构造方法
    public BallPanel() {
        init();
        //鼠标移动监听
        this.addMouseMotionListener(new Mou());
        //按压监听
        this.addMouseListener(new Mou());
        this.setFocusable(true);
        this.addKeyListener(this);
        timer.start();

        isStart = false;

    }


    //初始化方法
    public void init() {
        //坐标设置
        ballX = 450;
        ballY = 450;
        ballXV = 5;
        ballYV = 4;
        ballcolor = true;

        //板子属性设置(鼠标坐标)
        Mouse_X = 500;
        Mouse_Y = 500;
        Mouse_Color = true;

        //随机数
        random = new Random();

        //新建砖块,并设定位置大小
        zhuan = new zhuan[20];
        for (int j = 0, i = 0; j < 5; j++) {
            for (int k = 0; k < 4; k++) {

                int result = random.nextInt(100);
                if (result % 2 == 0) {
                    zhuan[i] = new zhuan(true, true, 25 + j * 130, 25 + k * 40);
                } else {
                    zhuan[i] = new zhuan(true, false, 25 + j * 130, 25 + k * 40);
                }
                i++;

            }
        }

    }

    //绘画类
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (ballcolor) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.BLUE);
        }
        g.fillOval(ballX, ballY, 20, 20);
        this.setBackground(Color.white);

        //画砖块

        for (int i = 0; i < 20; i++) {
            if (zhuan[i].isOk()) {
                if (zhuan[i].isColor()) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.blue);
                }
                g.fillRect(zhuan[i].getX(), zhuan[i].getY(), wide, high);
            }
        }

        //绘制板子
        if (Mouse_Color) {
            g.setColor(Color.RED);
            g.fillRect(Mouse_X - 50, Mouse_Y - 10, 100, 10);
            g.setColor(Color.BLUE);
            g.fillRect(Mouse_X - 50, Mouse_Y, 100, 10);
        } else {
            g.setColor(Color.BLUE);
            g.fillRect(Mouse_X - 50, Mouse_Y - 10, 100, 10);
            g.setColor(Color.RED);
            g.fillRect(Mouse_X - 50, Mouse_Y, 100, 10);
        }

        // 开始和结束文字
        if (!isStart) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("鼠标双击开始游戏", 300, 300);
        }
        if (isFail) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("游戏结束", 300, 300);
        }

    }

    /**
     * 事件监听类
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //与墙和挡板的碰撞判定

        if (isStart && !isFail) {
            //左右边界
            if (ballX >= 680 || ballX <= 0) {
                ballXV *= -1;
            } else if (ballY <= 0 || ballY >= 650) {
                //上下边界
                ballYV *= -1;
            } else if (ballY >= 640) {
                //失败判定
                isStart = !isStart;
            }

            //板子与球碰撞判定
            if (ballX >= Mouse_X - 50 && ballX <= Mouse_X + 50) {
                if (ballY >= Mouse_Y - 10 && ballY <= Mouse_Y) {
                    //判断板子颜色和球颜色相同
                    //只判定上方,按鼠标颜色属性...
                    if (ballcolor == Mouse_Color) {
                        ballYV *= -1;
                        ballcolor = !ballcolor;
                    }
                }
            }

            //砖块与球碰撞判定
            for (int i = 0; i < 20; i++) {
                if (zhuan[i].isOk()) {
                    if (ballX > zhuan[i].getX() && ballY > zhuan[i].getY()) {
                        if (ballX < zhuan[i].getX() + wide && ballY < zhuan[i].getY() + high) {
                            if (ballcolor == zhuan[i].isColor()) {
                                ballYV *= -1;
                                zhuan[i].setOk(false);
                            }
                        }
                    }
                }
            }
            //结束判定条件
            for (int i = 0, k = 0; i < 20; i++) {
                if (!zhuan[i].isOk()) {
                    k++;
                    if (k == 20) {
                        isFail = true;
                        break;
                    }
                } else {
                    k = 0;
                }
            }
            //运动
            ballX += ballXV;
            ballY += ballYV;
            repaint();
        }
    }


    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            System.out.println("1");
        }
    }

    /**
     * 鼠标监听类
     */
    private class Mou extends MouseAdapter {
        //点击
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            Mouse_Color = !Mouse_Color;
            if (e.getClickCount() == 2) {
                isStart = !isStart;
                ballX = 300;
                ballY = 300;
            }
            repaint();
        }

        //坐标
        @Override
        public void mouseMoved(MouseEvent e) {
            super.mouseMoved(e);
            Mouse_X = e.getX();
            Mouse_Y = e.getY();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

}

