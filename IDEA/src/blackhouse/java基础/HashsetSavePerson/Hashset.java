package blackhouse.HashsetSavePerson;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {

        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小姐1", 16);
        Person p2 = new Person("小姐1", 16);
        Person p3 = new Person("小姐1", 18);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        set.add(p1);
        set.add(p2);//p1和p2内容相同不被加入集合
        set.add(p3);
        System.out.println(p1 == p2);//地址值
        System.out.println(p1.equals(p2));//重写后比较内容
        System.out.println(set);


    }
}
