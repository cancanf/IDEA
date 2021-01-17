package 课程设计.计算器;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorPanel extends JPanel {
    public static void main(String[] args) {
        CalculatorPanel panel = new CalculatorPanel();
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setBounds(500, 500, 500, 500);
        jFrame.add(panel);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private JButton dispaly;
    private JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;

    public CalculatorPanel() {
        setLayout(new BorderLayout());

        result = 0;
        lastCommand = "=";
        start = true;

        dispaly = new JButton("0");
        dispaly.setEnabled(false);//禁用按钮
        add(dispaly, BorderLayout.NORTH);

        //监听器
        ActionListener insert = new InsertAction();
        CommandAction command = new CommandAction();

        panel = new JPanel();
        //棋盘布局
        panel.setLayout(new GridLayout(4, 4));

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", command);

        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", command);

        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);

        addButton("0", insert);
        addButton(".", insert);
        addButton("=", command);
        addButton("+", command);

        add(panel, BorderLayout.CENTER);

    }

    private void addButton(String lable, ActionListener listener) {
        JButton button = new JButton(lable);
        button.addActionListener(listener);
        panel.add(button);
    }

    private class InsertAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //数字按钮
            String input = e.getActionCommand();//得到被监听这的字符串
            if (start) {
                dispaly.setText("");//清空dispaly里的
                start = false;
            }
            dispaly.setText(dispaly.getText() + input);//组合数字
        }

    }

    private class CommandAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            //符号按钮
            if (start) {//开始为负号,添加负数
                if (command.equals("-")) {
                    dispaly.setText(command);
                    start = false;
                } else
                    lastCommand = command;
            } else {
                calculate(Double.parseDouble(dispaly.getText()));//当输入运算负号,
                // 将前一位数字传入进行计算
                lastCommand = command;
                start = true;
            }
        }
    }

    private void calculate(double x) {
        if (lastCommand.equals("+")) result += x;
        else if (lastCommand.equals("-")) result -= x;
        else if (lastCommand.equals("*")) result *= x;
        else if (lastCommand.equals("/")) result /= x;
        else if (lastCommand.equals("=")) result = x;
        dispaly.setText("" + result);
    }

}
