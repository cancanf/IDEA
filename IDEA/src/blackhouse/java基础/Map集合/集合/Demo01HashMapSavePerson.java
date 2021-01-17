package blackhouse.java基础.Map集合.集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show1();
        System.out.println("===========================");
        show2();
    }

    private static void show2() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("伊丽莎白", 18), "英国");
        map.put(new Person("秦始皇", 17), "咸阳");
        map.put(new Person("特离谱", 16), "美国");
        map.put(new Person("秦始皇", 17), "西安");
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry :
                set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "--->" + value);
        }


    }

    private static void show1() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京", new Person("张三", 18));
        map.put("上海", new Person("李四", 19));
        map.put("深圳", new Person("王麻子", 21));
        map.put("北京", new Person("王刘", 22));//key相同会替换掉原来的
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key + "--->" + value);
        }

    }

}
//运行结果:
//        上海--->Person{name='李四', age=19}
//        北京--->Person{name='王刘', age=22}
//        深圳--->Person{name='王麻子', age=21}
//        ===========================
//        Person{name='特离谱', age=16}--->美国
//        Person{name='秦始皇', age=17}--->西安
//        Person{name='伊丽莎白', age=18}--->英国