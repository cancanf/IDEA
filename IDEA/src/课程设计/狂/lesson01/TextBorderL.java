package 课程设计.狂.lesson01;

import java.awt.*;

public class TextBorderL {
    public static void main(String[] args) {
        Frame frame = new Frame("TestBorderLayout");
        Button East = new Button("East");
        Button West = new Button("West");
        Button South = new Button("south");
        Button North = new Button("North");
        Button Center = new Button("Center");
        //东西南北中
        frame.add(East, BorderLayout.EAST);
        frame.add(West, BorderLayout.WEST);
        frame.add(South, BorderLayout.WEST);
        frame.add(North, BorderLayout.NORTH);
        frame.add(Center, BorderLayout.CENTER);

        frame.setSize(1000, 500);
        frame.setVisible(true);


    }
}
