package blackhouse.p298.函数式接口.函数式编程;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Comparator {
    public static Comparator<String> getComparator() {
        //方法的返回值是一个借口,那么我们可以返回这个接口的匿名内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//
//                return o2.length()-o1.length();
//            }
//        };

        //返回值是一个函数式接口,我们可以返回一个Lambda表达式
//        return (String o1 , String o2)->{
//            return o2.length()-o1.length();
//        };
        //继续优化Lambda
        return (o1, o2) -> o2.length() - o1.length();

    }

    public static void main(String[] args) {
        String[] arr = {"aaa", "b", "ccccc", "ddddddddd"};
        System.out.println(Arrays.toString(arr));//[aaa, b, ccccc, ddddddddd]
        Comparator<String> comparator = getComparator();
        Arrays.sort(arr, getComparator());
        System.out.println(Arrays.toString(arr)); //[ddddddddd, ccccc, aaa, b]
    }
}
