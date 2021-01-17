package 课程设计.狂.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextText01 {
    public static void main(String[] args) {
        //启动
        new MyFrame();
    }
}

class MyFrame extends Frame {
    public MyFrame() {
        TextField textField = new TextField();
        add(textField);
        //监听这个文本框输入的文字
        MyActionListrner2 myActionListrner2 = new MyActionListrner2();
        //按下enter 就会触发这个输入框的事件
        textField.addActionListener(myActionListrner2);
        //设置替换编码,可以保证安全性.
        textField.setEchoChar('*');
        setVisible(true);
        pack();
    }
}

class MyActionListrner2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField) e.getSource();//获得资源,返回为一个对象;
        System.out.println(field.getText());//获得输入框的文本
        //输入后清空输入框
        field.setText("");
    }
}