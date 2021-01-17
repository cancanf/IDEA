package blackhouse.java基础.Map集合.集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01Map {
    public static void main(String[] args) {

//        show1();
//        show2();
        show3();
    }

    private static void show3() {
        Map<String, String> map = new HashMap<>();
        map.put("李晨1", "haoer1");
        map.put("李晨2", "haoer2");
        map.put("李晨3", "haoer3");
        Set<String> set = map.keySet();//键的集合

        Iterator<String> it = set.iterator();//迭代器
        while (it.hasNext()) {
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        for (String key : set) {
            System.out.println(key + "=" + map.get(key));
        }

    }

    private static void show2() {
        Map<String, String> map = new HashMap<>();
        map.put("李晨1", "haoer1");
        map.put("李晨2", "haoer2");
        map.put("李晨3", "haoer3");
        System.out.println(map.remove("李晨1"));//返回被删除的值
        System.out.println(map.remove("李晨"));//不存在key返回null
    }

    private static void show1() {
        Map<String, String> map = new HashMap<>();

        String v1 = map.put("李晨", "haoer");//v1: null
        System.out.println("v1: " + v1);
        String v2 = map.put("李晨", "haoer2");//v2: haoer
        System.out.println("v2: " + v2);
        map.put("李晨1", "haoer1");
        map.put("李晨2", "haoer2");
        map.put("李晨3", "haoer3");
        System.out.println(map);
        //{李晨=haoer2, 李晨1=haoer1, 李晨2=haoer2, 李晨3=haoer3}
    }
}
