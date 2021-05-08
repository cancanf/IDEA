package 考试.每日一题.day17;

class X {
    Y y = new Y();

    public X() {
        System.out.println("x");
    }
}

class Y {
    public Y() {
        System.out.println("y");
    }
}

public class Z extends X {
    Y y = new Y();

    public Z() {
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}
