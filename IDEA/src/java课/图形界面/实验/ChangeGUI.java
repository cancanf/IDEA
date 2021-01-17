package java课.图形界面.实验;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeGUI extends JFrame {
    private JButton button;
    private JLabel label;

    public ChangeGUI() {
        super("Say Hello");
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        button = new JButton("OK");
        button.setBackground(Color.ORANGE);
        button.setBackground(Color.RED);
        panel.add(button);
        button.addActionListener(new OKActionListener());
        label = new JLabel("你好");
        label.setForeground(Color.BLUE);
        panel2.add(label);
        add(panel2);
        add(panel);
    }

    private class OKActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (label.getText() == "你好") {
                label.setText("再见");
            } else {
                label.setText("你好");
            }
        }
    }

    public static void main(String[] args) {
        ChangeGUI change = new ChangeGUI();
        change.setSize(200, 100);
        change.setVisible(true);
        change.setLocationRelativeTo(null);
        change.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

