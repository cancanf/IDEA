package blackhouse.java基础.HashsetSavePerson;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo01LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("yead");
        System.out.println(set);

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("yead");
        System.out.println(linked);
    }
}
