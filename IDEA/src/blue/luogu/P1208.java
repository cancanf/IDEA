package blue.luogu;

import java.util.*;

public class P1208 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, m, sum = 0, money = 0;
        n = in.nextInt();
        m = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            map.put(in.nextInt(), in.nextInt());
        }
        //排序
        List<Integer> mapKeys = new ArrayList<>(map.keySet());
        Collections.sort(mapKeys);

        for (Integer ina : mapKeys) {
            while (mapKeys.get(ina) >= 0) {

            }
        }


    }
}
