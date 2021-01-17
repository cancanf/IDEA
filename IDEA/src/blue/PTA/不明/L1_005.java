package blue.PTA.不明;

import java.util.Scanner;

public class L1_005 {
    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        int N, k;
        int[] ints = new int[1000];
        int shiji, kaoshi;
        String kaozheng;
        Person[] per = new Person[1000];
        Scanner in = new Scanner(System.in);
        //输入部分
        N = in.nextInt();
        for (int i = 0; i < N; i++) {
            kaozheng = in.next();
            shiji = in.nextInt();
            kaoshi = in.nextInt();
            per[i] = new Person(kaozheng, shiji, kaoshi);
        }

        k = in.nextInt();

//        for (int i = 0; i < k; i++) {
//            ints[i] = in.nextInt();
//        }

        //输出部分
        for (int i = 0; i < k; i++) {
            int b = in.nextInt();
            for (int j = 0; j < N; j++) {
                if (per[j].shiji == ints[b]) {
                    System.out.println(per[j].kaozheng + " " + per[j].kaoshi);
                    continue;
                }
            }
        }
        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l1);
    }

    public static class Person {
        int shiji, kaoshi;
        String kaozheng;

        public Person(String kaozheng, int shiji, int kaoshi) {
            this.shiji = shiji;
            this.kaoshi = kaoshi;
            this.kaozheng = kaozheng;
        }

    }
}
/*15538
5210
1249
1649
1671
1051*/

/*1211
 *977
 * 1281
 * */
/*
2748
1647
940
1576
1274
* */