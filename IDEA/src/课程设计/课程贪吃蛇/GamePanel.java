package 课程设计.课程贪吃蛇;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel implements KeyListener, ActionListener {
    //蛇的数据结构
    int length;
    int[] snakeX = new int[600];//蛇的X坐标
    int[] snakeY = new int[500];//蛇的Y坐标
    String fx;//方向
    //小蛇食物的数据
    int foodX;
    int foodY;
    Random random = new Random();
    //游戏状态
    boolean isStart = false;
    boolean isFail = false;//失败
    //定时器
    Timer timer = new Timer(100, this);

    //构造器
    public GamePanel() {
        init();
        //获得交点和键盘事件
        this.setFocusable(true);//获得焦点事件
        this.addKeyListener(this);//键盘监听事件
        timer.start();//游戏一开始就启动定时器
    }

    //初始化方法
    public void init() {
        //设置初始蛇的长度3和每节的初始位置
        //图片的大小为25*25格式
        length = 3;
        snakeX[0] = 100;
        snakeY[0] = 100;
        snakeX[1] = 75;
        snakeY[1] = 100;
        snakeX[2] = 50;
        snakeY[2] = 100;
        fx = "R";
        //随机设置食物出现的位置
        foodX = 25 + 25 * random.nextInt(34);//  600/25
        foodY = 25 + 25 * random.nextInt(23);//  500/25
    }

    @Override
    //绘制类
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//清屏
        //绘制静态面板
        this.setBackground(Color.white);
        //默认的游戏界面
        g.fillRect(0, 0, 900, 720);
        //蛇头的方向变化需要图片的变化来体现方向
        if (fx.equals("R")) {
            Date.right.paintIcon(this, g, snakeX[0], snakeY[0]);//画在哪里 this ,用什么画, g这个画笔,画在哪里 snakeX[0] snakeY[0]
        } else if (fx.equals("L")) {
            Date.left.paintIcon(this, g, snakeX[0], snakeY[0]);
        } else if (fx.equals("U")) {
            Date.up.paintIcon(this, g, snakeX[0], snakeY[0]);
        } else if (fx.equals("D")) {
            Date.down.paintIcon(this, g, snakeX[0], snakeY[0]);
        }

        //绘画蛇的身体
        //不从0开始是因为不需要画头
        for (int i = 1; i < length; i++) {
            Date.body.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        //小蛇食物
        Date.food.paintIcon(this, g, foodX, foodY);
        //设置提示字
        if (isStart == false) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("微软雅", Font.BOLD, 40));//设置字体的
            g.drawString("按下空格开始游戏", 300, 300);
        }
        if (isFail == true) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("微软雅", Font.BOLD, 40));
            g.drawString("游戏失败", 300, 300);
        }
    }


    //键盘监听
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();//接受键盘监听返回的数字编码,每个键都不一样
        if (keyCode == KeyEvent.VK_SPACE) {
            if (isFail) {
                isFail = false;//结束状态变为false
                init();
            } else {
                isStart = !isStart;//暂停和运行中切换
            }
            repaint();//重画方法
        }
        //改变蛇头方向
        if (keyCode == KeyEvent.VK_UP) {
            fx = "U";
        } else if (keyCode == KeyEvent.VK_DOWN) {
            fx = "D";
        } else if (keyCode == KeyEvent.VK_LEFT) {
            fx = "L";
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            fx = "R";
        }
    }

    //事件监听
    @Override
    public void actionPerformed(ActionEvent e) {
        //判断吃到食物


        //判断游戏是否开始1
        if (isStart && isFail == false) {
            if (snakeX[0] == foodX && snakeY[0] == foodY) {//食物和蛇头坐标相等==吃到食物
                length++;//长度+1
                foodX = 25 * random.nextInt(34);//再次随机食物位置
                foodY = 25 * random.nextInt(23);
            }
            //第二节身体跟着头.三节跟二节,实现运动
            for (int i = length - 1; i > 0; i--) {
                snakeX[i] = snakeX[i - 1];
                snakeY[i] = snakeY[i - 1];
            }
            //
            if (fx == "R") {
                snakeX[0] += 25;//头部按方向运动
                if (snakeX[0] > 900) {
                    snakeX[0] = 0;//可以穿过边界
                }
            } else if (fx == "L") {
                snakeX[0] -= 25;
                if (snakeX[0] < 0) {
                    snakeX[0] = 900;
                }

            } else if (fx == "U") {
                snakeY[0] -= 25;
                if (snakeY[0] < 0) {
                    snakeY[0] = 720;
                }

            } else if (fx == "D") {
                snakeY[0] += 25;
                if (snakeY[0] > 720) {
                    snakeY[0] = 0;
                }
            }
            //失败判定
            for (int i = 1; i < length; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                    //蛇头坐标和身体坐标相等
                    isFail = true;//结束
                }
            }
            repaint();//重画
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }


}

