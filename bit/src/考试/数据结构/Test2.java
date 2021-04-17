package 考试.数据结构;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            String[] s1 = s.split(" ");
            set.addAll(Arrays.asList(s1));
        }
        System.out.println(set.size());
    }
}
