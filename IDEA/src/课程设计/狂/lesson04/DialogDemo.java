package 课程设计.狂.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo extends JFrame {

    public DialogDemo() {
        this.setVisible(true);
        this.setSize(700, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //JFrame放东西的容器
        Container container = this.getContentPane();
        //绝对布局
        container.setLayout(null);
        //按钮
        JButton button = new JButton("点击弹出");
        button.setBounds(30, 30, 200, 50);

        //监听器
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialogDemo();
            }
        });
        container.add(button);
    }

    public static void main(String[] args) {
        new DialogDemo();
    }
}

class MyDialogDemo extends JDialog {
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100, 100, 500, 500);

        Container container = this.getContentPane();
        container.setLayout(null);
        JLabel label = new JLabel("不好讲asfs ");
        label.setSize(300, 300);
        container.add(label);

    }
}
