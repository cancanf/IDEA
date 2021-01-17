package blackhouse.p298.函数式接口.常用函数式接口;

import java.util.function.Function;

public class Demo01Function {
    public static void change(String s, Function<String, Integer> fun) {
        Integer in = fun.apply(s);
        System.out.println(in);

    }

    public static void main(String[] args) {
        String s = "1254";
        change(s, (str) -> Integer.parseInt(str));
    }
}
