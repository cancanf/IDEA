package 课程设计.狂.lesson06;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TextComboboxDemo02 extends JFrame {
    public TextComboboxDemo02() throws HeadlessException {
        //下拉选择框
        Container container = this.getContentPane();


        // String [] contents = {"1","2","3"};静态数组
        //动态数组
        Vector vector = new Vector();
        JList<Object> jList = new JList<>(vector);
        vector.add("1");
        vector.add("2");
        vector.add("3");
        container.add(jList);
        setVisible(true);
        setSize(500, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TextComboboxDemo02();
    }
}
