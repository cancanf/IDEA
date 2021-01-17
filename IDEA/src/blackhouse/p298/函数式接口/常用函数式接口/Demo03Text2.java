package blackhouse.p298.函数式接口.常用函数式接口;

import java.util.function.Function;

public class Demo03Text2 {
    public static int method(String s, Function<String, String> fun1,
                             Function<String, Integer> fun2,
                             Function<Integer, Integer> fun3) {

        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

    public static void main(String[] args) {
        String str = "严佳旺,20";
        int num = method(str, (s) -> s.split(",")[1],
                (s) -> Integer.parseInt(s),
                (i) -> i + 100);
        System.out.println(num);
    }
}
