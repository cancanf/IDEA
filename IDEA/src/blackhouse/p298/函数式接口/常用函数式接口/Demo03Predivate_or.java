package blackhouse.p298.函数式接口.常用函数式接口;

import java.util.function.Predicate;

public class Demo03Predivate_or {
    public static boolean mehtod(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.or(pre2).test(s);
//        return pre1.test(s)||pre2.test(s);
    }

    public static void main(String[] args) {
        String str = "sasg";
        boolean b = mehtod(str,
                (s) -> s.length() > 5,
                (s) -> s.contains("a")
        );
        System.out.println(b);

    }
}
