package 开放性实验;

import java.util.ArrayList;
import java.util.Random;

public class 数据 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20000; i++) {
            list.add(random.nextInt());
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
