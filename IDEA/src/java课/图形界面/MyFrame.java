package java课.图形界面;

import java.awt.*;

public class MyFrame extends Frame {
    public static void main(String[] args) {
        MyFrame fr = new MyFrame("HelloOutThere !");
        fr.setSize(400, 200);
        fr.setBackground(Color.blue);
        fr.setVisible(true);
    }

    public MyFrame(String str) {
        super(str);
    }


}
