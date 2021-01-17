package java课.图形界面.实验;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

class choice extends JFrame {

    JLabel lable;
    JButton button;

    public choice() {

        lable = new JLabel("你好！");
        button = new JButton("切换");
        JPanel panel = new JPanel();
        panel.add(lable);
        panel.add(button);
        button.addActionListener(new ActionListener() { //使用匿名写法完成实现相应的方法
            public void actionPerformed(ActionEvent e) {
                if (lable.getText() == "你好！") {
                    lable.setText("再见！");
                } else {
                    lable.setText("你好！");
                }
            }
        });
        JFrame frame = new JFrame();
        frame.setVisible(true);//设置可见性
        frame.setSize(500, 500);//设置窗口大小
        frame.setLocation(200, 200);//设置弹出位置
        frame.setResizable(false);//固定大小。
        //监听事件关闭窗口
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            //窗口关闭
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}