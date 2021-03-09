package 课堂代码.课后作业.认识String类;

import java.util.ArrayList;
import java.util.Arrays;

public class Mysplit {
    public static void main(String[] args) {
        String[] mysplit = mysplit("192.168.0.1", ".");
        System.out.println(Arrays.toString(mysplit));

    }

    private static String[] mysplit(String str, String s) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder(str);

        if (str.equals("")) {
            return new String[0];
        }
        if (s.equals("")) {
            return new String[]{str};
        }

        while (true) {
            int index = builder.indexOf(s);
            if (index != -1) {
                String substring = builder.substring(0, index);
                list.add(substring);
                builder = builder.delete(0, index + 1);
            } else {
                list.add(builder.toString());
                return list.toArray(new String[0]);
            }
        }
    }
}
