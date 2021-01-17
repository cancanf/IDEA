package 课程设计.狂.lesson03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TextKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}

class KeyFrame extends Frame {
    public KeyFrame() {
        setBounds(1, 2, 300, 400);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            //监视键盘按下
            @Override
            public void keyPressed(KeyEvent e) {

                super.keyPressed(e);
                //获得按得是哪个键
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_UP) {
                    System.out.println("按了上键");
                }

            }
        });
    }
}