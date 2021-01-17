package blackhouse.java基础.异常处理.Demo01.Exception;

import java.util.Objects;

public class Demo04Objects {
    public static void main(String[] args) {

        method(null);
    }

    private static void method(Object obj) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "传递的对象的值为null");
    }
}
