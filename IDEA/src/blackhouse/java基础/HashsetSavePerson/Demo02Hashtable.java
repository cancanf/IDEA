package blackhouse.java基础.HashsetSavePerson;

import java.util.Hashtable;

public class Demo02Hashtable {
    public static void main(String[] args) {


        Hashtable<String, String> table = new Hashtable<>();
        table.put(null, "a");
        table.put("b", null);
        table.put(null, null);
        System.out.println(table);
    }
}