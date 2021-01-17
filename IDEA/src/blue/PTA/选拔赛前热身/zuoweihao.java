package blue.PTA.选拔赛前热身;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class zuoweihao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, M;
        N = in.nextInt();
        ArrayList<person> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(new person(in.next(), in.nextInt(), in.nextInt()));
        }
        Collections.sort(list, new Comparator<person>() {
            @Override
            public int compare(person o1, person o2) {
                return o1.shiji - o2.shiji;
            }
        });
        M = in.nextInt();
        for (int i = 0; i < M; i++) {
            int temp = in.nextInt();
            System.out.println(list.get(temp - 1).zhunkao + " " + list.get(temp - 1).kaoshi);
        }
    }

    public static class person {
        String zhunkao;
        int shiji, kaoshi;

        public person(String zhunkao, int shiji, int kaoshi) {
            this.zhunkao = zhunkao;
            this.shiji = shiji;
            this.kaoshi = kaoshi;
        }

        public String getZhunkao() {
            return zhunkao;
        }

        public int getShiji() {
            return shiji;
        }

        public int getKaoshi() {
            return kaoshi;
        }
    }
}
