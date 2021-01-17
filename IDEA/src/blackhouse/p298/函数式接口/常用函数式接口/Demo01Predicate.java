package blackhouse.p298.函数式接口.常用函数式接口;

import java.util.function.Predicate;

public class Demo01Predicate {
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "adsfadsgf";

//        boolean b = checkString(s,(str)->{
//            return str.length()>5;
//        });
        //优化
        boolean b = checkString(s, (str) -> str.length() > 5);
        System.out.println(b);
    }
}
