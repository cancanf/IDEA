package 课程设计.狂.lesson02.计算器.原版;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text {
    public static void main(String[] args) {
        new Calculator();
    }
}

class Calculator extends Frame {
    public Calculator() {
        //三个文本框
        TextField num1 = new TextField(10);
        TextField num2 = new TextField(10);
        TextField num3 = new TextField(20);

        //按钮
        Button button = new Button("=");
        button.addActionListener(new MiscalculateListener(num1, num2, num3));
        //一个标签
        Label label = new Label("+");
        //布局
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);
        pack();
        setVisible(true);

    }
}

class MiscalculateListener implements ActionListener {
    //获取三个变量
    private TextField num1, num2, num3;

    public MiscalculateListener(TextField num1, TextField num2, TextField num3) {

        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        num3.setText("" + (n1 + n2));

    }
}