package blue.PTA.比赛;

import java.util.*;

public class 悄悄关注7_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /**/
        int N, M, sum = 0;
        N = in.nextInt();
        HashMap<String, Integer> dianzan = new HashMap<>();
        String[] ID = in.nextLine().split(" ");
        //点赞数据录入
        M = in.nextInt();
        for (int i = 0; i < M; i++) {
            String a = in.next();
            int b = in.nextInt();
            dianzan.put(a, b);

            sum += b;
        }
        int avg = sum / M;
        //创建KEY的集合和迭代器.遍历集合删除点赞集合中的点赞数小于平均值的对.
        Set<String> keySet = dianzan.keySet();
        Iterator<String> iterator = keySet.iterator();
        //存贮结果的list集合
        ArrayList<String> list = new ArrayList<>();
        while (iterator.hasNext()) {
            int i;
            String name = iterator.next();
            for (i = 1; i < N; i++) {
                if (ID[i].equals(name)) {
                    break;
                }
            }
            if (dianzan.get(name) > avg && i == N) {
                list.add(name);
            }
        }
        //排序集合
        Collections.sort(list);
        if (list.size() == 0) {
            System.out.println("Bing Mei You");
        } else {
            for (String s : list) {
                System.out.println(s);
            }
        }


    }
}
