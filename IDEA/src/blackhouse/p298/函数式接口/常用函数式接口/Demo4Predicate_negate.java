package blackhouse.p298.函数式接口.常用函数式接口;

import java.util.function.Predicate;

public class Demo4Predicate_negate {
    public static boolean method(String s, Predicate<String> pre1) {
        return !pre1.test(s);

    }

    public static void main(String[] args) {
        String str = "s";
        boolean b = method(str, (s) -> s.length() > 5);
        System.out.println(b);

    }
}
