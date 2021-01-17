package blue.试炼;

import java.util.ArrayList;
import java.util.Scanner;

public class erchashu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ji = 0, shendu = 1;
        int max = 0, shendujili = 0, sum = 0;
        int N = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(in.nextInt());
        }
        while (ji < N) {
            for (int i = 1; i <= Math.pow(2, shendu - 1); i++) {
                sum += list.get(ji);
                ji++;
            }
            if (sum > max) {
                max = sum;
                shendujili = shendu;
                sum = 0;
            }
            shendu++;
        }
        System.out.println(shendujili);

    }
}
