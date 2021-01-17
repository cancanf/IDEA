package 课程设计.ball.ballNew;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Klisten implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("键被按下" + (char) e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("1");
            ;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
