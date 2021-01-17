package blackhouse.p298.函数式接口.常用函数式接口;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo05Text implements MyPredicate {
    public static ArrayList<String> methed(String[] array, Predicate<String> pre1, Predicate<String> pre2) {

        ArrayList<String> list = new ArrayList<>();
        for (String s : array) {
            boolean b = pre1.and(pre2).test(s);
            if (b) {
                list.add(s);
            }
        }
        return list;

    }

    public static void main(String[] args) {

        String[] arr = {"不是个人,x", "谁是个人,y", "二赖子,x", "啥不是,y"};

        ArrayList<String> x = methed(arr,
                (s) -> s.split(",")[1].equals("x"),
                (s) -> s.split(",")[0].length() == 4);
        System.out.println(x);

    }

}
