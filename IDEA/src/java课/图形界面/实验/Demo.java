package java课.图形界面.实验;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Demo {
    public static void main(String[] args) {
        new DemoMouseListener();
    }
}

class DemoMouseListener extends JFrame {
    public DemoMouseListener() {
        JButton button = new JButton("一个简单的按钮");
        JLabel label = new JLabel("你好");
        button.setSize(200, 200);
        add(button);
        button.add(label);

        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (label.getText().equals("你好")) {
                    label.setText("再见");
                } else {
                    label.setText("你好");
                }

            }
        });


    }
}