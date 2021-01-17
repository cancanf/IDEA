package blue.PTA.不明;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class L1_007 {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("-", "fu");
        map.put("0", "ling");
        map.put("1", "yi");
        map.put("2", "er");
        map.put("3", "san");
        map.put("4", "si");
        map.put("5", "wu");
        map.put("6", "liu");
        map.put("7", "qi");
        map.put("8", "ba");
        map.put("9", "jiu");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = reader.readLine();
        String[] split = read.split("");
        for (int i = 0; i < split.length; i++) {
            if (i < split.length - 1) {
                System.out.print(map.get(split[i]) + " ");
            } else {
                System.out.print(map.get(split[i]));
            }
        }

    }
}
