package blue.PTA.不明;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class L1_005_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//输入流
        //输入部分
        //使用map集合的key键和value键的对应关系
        Map<String, String> map = new HashMap<>();
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            String s = reader.readLine();
            //操作字符串将s以" "分开用,相隔.存进arr数组
            String[] arr = s.split(" ");
            //将试机座位当做key键方便后续查询,其他两个数据作为value键
            map.put(arr[1], arr[0] + " " + arr[2]);//map集合存储数据
        }
        //查询几个人
        int p = Integer.parseInt(reader.readLine());
        String[] sarr = reader.readLine().split(" ");
        reader.close();
        for (int i = 0; i < p; i++) {
            System.out.println(sarr[i]);
            System.out.println(map.get(sarr[i]));
        }
    }

}
