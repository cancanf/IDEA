package blackhouse.java基础.Map集合.LinkedHashMao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Demo01LinkedHashMap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("a", "d");
        System.out.println(map);//key不允许重复

        LinkedHashMap<String, String> linked = new LinkedHashMap<>();

        linked.put("a", "a");
        linked.put("c", "c");
        linked.put("b", "b");
        linked.put("a", "d");
        System.out.println(linked);
        Scanner in = new Scanner(System.in);

    }

}
