package blackhouse.java基础.Collections类;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01, 1, 3, 2, 4, 5);
        System.out.println(list01);//[1, 3, 2, 4, 5]
        Collections.sort(list01);//默认排序
        System.out.println(list01);//[1, 2, 3, 4, 5]

        ArrayList<String> list02 = new ArrayList<>();
        Collections.addAll(list02, "a", "c", "b");
        System.out.println(list02);
        Collections.sort(list02);
        System.out.println(list02);

        /*sort(List<t> list)使用前提
        被排序的集合必须实现Comparable,重写接口的方法compareTo定义排序的规则
        */
        ArrayList<Person> list03 = new ArrayList<>();
        Collections.addAll(list03,
                new Person("a", 2), new Person("b", 5), new Person("c", 3));
        System.out.println(list03);
        Collections.sort(list03);
        System.out.println(list03);

    }
}
