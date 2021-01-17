package blackhouse.p298.函数式接口.常用函数式接口;

import java.util.function.Consumer;

public class Demo02AndThen {
    public static void methid(String s, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(s);

    }

    public static void main(String[] args) {
        methid("asdFasdg",
                (t) -> {
                    System.out.println(t.toUpperCase());
                },
                (t) -> {
                    System.out.println(t.toLowerCase());
                });
    }
}
