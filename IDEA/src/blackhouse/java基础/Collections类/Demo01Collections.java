package blackhouse.java基础.Collections类;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d");//像集合内传入元素
        System.out.println(list);
        Collections.shuffle(list);//打乱集合
        System.out.println(list);
    }
}
