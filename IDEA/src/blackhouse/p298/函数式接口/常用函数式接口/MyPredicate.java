package blackhouse.p298.函数式接口.常用函数式接口;

import java.util.function.Predicate;

public interface MyPredicate {
    public static boolean methed(String array, Predicate<String> pre1, Predicate<String> pre2) {

        return pre1.and(pre2).test(array);

    }

}
