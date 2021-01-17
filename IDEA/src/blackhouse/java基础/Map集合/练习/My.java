package blackhouse.java基础.Map集合.练习;

import java.util.HashMap;
import java.util.Scanner;

public class My {
    public static void main(String[] args) {

        String str;
        char[] chars = new char[20];
        Scanner in = new Scanner(System.in);
        str = in.next();
        chars = str.toCharArray();
        //处理
        HashMap<Character, Integer> map = new HashMap<>();//HashMap集合的特点就是key不能重复，
        for (Character key : chars) {
            Integer value;
            if (map.containsKey(key)) {//判断字符是否存在，
                value = map.get(key);
                value++;
            } else {
                value = 1;
            }
            map.put(key, value);
        }
//        Set<Character> set = map.keySet();
//        Iterator<Character> it = set.iterator();
//        while(it.hasNext()){
//            Character key = it.next();
//            Integer value = map.get(key);
//            System.out.println("key = " + key + "  value = " + value);
//        }
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("key = " + key + "  value = " + value);
        }


    }
}
