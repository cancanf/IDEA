package blue.PTA.选拔赛;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 喂猫 {
    public static void main(String[] args) {
        int N, K;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();
        in.nextLine();

        tuijian[] tuijians = new tuijian[K];
        cat[] cats = new cat[N];
        for (int i = 0; i < K; i++) {
            String[] s = in.nextLine().split(" ");
            tuijians[i] = new tuijian(s[0], s[1], s[2], s[3]);
        }
        for (int i = 0; i < N; i++) {
            String[] s = in.nextLine().split(" ");
            cats[i] = new cat(s[0], s[1]);
        }

        //13.6*w+70推荐摄入
        DecimalFormat df = new DecimalFormat(".0");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                String cp = cats[i].pinzhong;
                String tp = tuijians[j].pinzhong;
                if (cp.equals(tp)) {
                    double czhong = Double.parseDouble(cats[i].tizhong);
                    double tdzhong = Double.parseDouble(tuijians[j].zuidi);
                    double tgzhong = Double.parseDouble(tuijians[j].zuigao);
                    double bzhong = Double.parseDouble(tuijians[j].tuijian) * 13.6 + 70;
                    if (czhong > tgzhong) {
                        System.out.println("overweight " + df.format(bzhong));
                    } else if (czhong < tdzhong) {
                        System.out.println("underweight " + df.format(bzhong));
                    } else {
                        System.out.println("OK " + df.format(bzhong));
                    }
                }
            }
        }
    }

    public static class cat {
        String pinzhong;
        String tizhong;

        public cat(String pinzhong, String tizhong) {
            this.pinzhong = pinzhong;
            this.tizhong = tizhong;
        }

        public String getPinzhong() {
            return pinzhong;
        }

        public String getTizhong() {
            return tizhong;
        }
    }

    public static class tuijian {
        String pinzhong;
        String zuidi, zuigao, tuijian;

        public tuijian(String pinzhong, String zuidi, String zuigao, String tuijian) {
            this.pinzhong = pinzhong;
            this.zuidi = zuidi;
            this.zuigao = zuigao;
            this.tuijian = tuijian;
        }

        public String getPinzhong() {
            return pinzhong;
        }

        public String getZuidi() {
            return zuidi;
        }

        public String getZuigao() {
            return zuigao;
        }

        public String getTuijian() {
            return tuijian;
        }
    }
}
