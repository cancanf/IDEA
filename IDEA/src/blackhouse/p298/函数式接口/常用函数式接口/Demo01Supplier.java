package blackhouse.p298.函数式接口.常用函数式接口;

import java.util.function.Supplier;

public class Demo01Supplier {
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        String s1 = getString(() -> {
            return "123";
        });
        System.out.println(s1);
        //Lambda表达式优化
        String s2 = getString(() -> "123");
        System.out.println(s2);

    }
}
