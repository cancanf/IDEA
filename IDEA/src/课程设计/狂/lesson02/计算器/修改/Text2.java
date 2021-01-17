package 课程设计.狂.lesson02.计算器.修改;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text2 {
    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}

class Calculator extends Frame {

    TextField num1, num2, num3;

    public void loadFrame() {

        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20);
        Button button = new Button("=");
        Label label = new Label("+");

        button.addActionListener(new MyCalculatorListener(this));
        //一个标签

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

    class MyCalculatorListener implements ActionListener {
        Calculator calculator = null;

        public MyCalculatorListener(Calculator calculator) {
            this.calculator = calculator;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText("" + (n1 + n2));
        }
    }
}