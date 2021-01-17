package blackhouse.java基础.Collections类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03sort {
    public static void main(String[] args) {

        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01, 1, 3, 2, 4, 5);
        System.out.println(list01);

        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list01);

        ArrayList<Students> list2 = new ArrayList<>();
        Collections.addAll(list2, new Students("c", 1), new Students("b", 1), new Students("a", 3));
        System.out.println(list2);

        Collections.sort(list2, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                int result = o1.getAge() - o2.getAge();//年龄相同,按首字母排序;
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });

        System.out.println(list2);
    }
}
