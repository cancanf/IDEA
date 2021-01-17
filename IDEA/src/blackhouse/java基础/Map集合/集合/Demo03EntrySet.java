package blackhouse.java基础.Map集合.集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03EntrySet {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵1", 155);
        map.put("赵2", 165);
        map.put("赵3", 175);
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }


    }
}
