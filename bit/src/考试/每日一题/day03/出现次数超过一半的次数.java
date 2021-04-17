package 考试.每日一题.day03;

import java.util.HashMap;

public class 出现次数超过一半的次数 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 2, 2, 5, 4, 2, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.print(MoreThanHalfNum_Solution(a));
    }

    public static int MoreThanHalfNum_Solution(int[] array) {
        int a = array.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a; i++) {
            int index = array[i];
            if (map.containsKey(index)) {
                map.put(index, map.get(index) + 1);

            } else {
                map.put(index, 1);
            }
        }
        for (int i = 0; i < a; i++) {
            int index = array[i];
            if (map.get(index) > a / 2) {
                return index;
            }
        }
        return 0;

    }
}

