package blackhouse.p298.函数式接口.函数式接口;

public class Demo {
    public static void show(MyFunctionalInterface myinter) {
        myinter.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionalInterfaceIMPL());

        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        show(() -> {
            System.out.println("Lambda表达式");

        });

        show(() -> System.out.println("Lambada的简化"));
    }
}
