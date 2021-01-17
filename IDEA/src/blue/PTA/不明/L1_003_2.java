package blue.PTA.不明;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class L1_003_2 {
    public static void main(String[] args) throws IOException {
        //1000数字如果使用整形会导致数字过大
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] chars = str.toCharArray();
        int[] ints = new int[10];
        //计数
        for (int i = 0; i < chars.length; i++) {
            ints[chars[i] - '0']++;
        }
        //输出
        for (int i = 0; i < 10; i++) {
            if (ints[i] != 0) {
                System.out.println(i + ":" + ints[i]);
            }
        }
    }

}
