package blackhouse.p298.函数式接口.常用函数式接口;

import java.util.function.Consumer;

public class Demo01Consumer {
    public static void method(String name, Consumer<String> com) {
        com.accept(name);
    }

    public static void main(String[] args) {
        method("你好", (name) -> System.out.println(name));
        method("我不好", (name) -> {
            //反转字符串
            String s = new StringBuilder(name).reverse().toString();
            System.out.println(s);
        });
    }
}
