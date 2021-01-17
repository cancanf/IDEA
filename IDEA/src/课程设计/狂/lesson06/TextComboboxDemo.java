package 课程设计.狂.lesson06;

import javax.swing.*;
import java.awt.*;

public class TextComboboxDemo extends JFrame {
    public TextComboboxDemo() throws HeadlessException {
        //下拉选择框
        Container container = this.getContentPane();
        JComboBox status = new JComboBox();
        status.addItem(null);
        status.addItem("正在热映");
        status.addItem("已下架");
        status.addItem("即将上映");

        container.add(status);

        setVisible(true);
        setSize(500, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TextComboboxDemo();
    }
}
