package blue.试炼;

import java.util.ArrayList;

public class zichuan {
    public static void main(String[] args) {
        long count = 0;
        String str = "0100110001010001";
        char[] chars = str.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String temp = str.substring(i, j);
                if (!list.contains(temp)) {
                    list.add(temp);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
