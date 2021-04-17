package 考试.每日一题.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 删除公共字符 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] split1 = in.nextLine().split("");
        String[] split = in.nextLine().split("");
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(split));
        ArrayList<String> list = new ArrayList<>(Arrays.asList(split1));
        list.removeAll(list1);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
