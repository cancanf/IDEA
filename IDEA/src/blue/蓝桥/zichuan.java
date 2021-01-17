package blue.蓝桥;

import java.util.ArrayList;

public class zichuan {
    public static void main(String[] args) {
        String s = "0100110001010001";
        int count = 0;
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                //用下标拆分字符串.
                String ss = s.substring(i, j);
                //检查集合里面是否有相同元素,有返回1,没有返回0
                if (!list.contains(ss)) {
                    list.add(ss);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
