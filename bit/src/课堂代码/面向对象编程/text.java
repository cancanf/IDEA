package 课堂代码.面向对象编程;

class tom {
    public tom() {
        System.out.println("tom");
    }
}

class bob extends tom {
    int num = 1;

    public bob(int a) {
    }

    public void add() {

    }
}

public class text extends bob {
    public text(int a) {
        super(a);
        System.out.println("text");
        super.add();
    }

    public static void main(String[] args) {
        new text(1);
    }
}
