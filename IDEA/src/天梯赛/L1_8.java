package 天梯赛2020;

import java.util.Scanner;

public class L1_8 {
    public static class shu {
        String sh;
        String caozuo;
        String shijian;

        public shu(String sh, String caozuo, String shijian) {
            this.sh = sh;
            this.caozuo = caozuo;
            this.shijian = shijian;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        for (int i = 0; i < N; i++) {
            //每天结算
            shu[] list = new shu[1001];
            int sum = 0, ci = 0;
            while (true) {
                String[] s = in.nextLine().split(" ");
                if (s[0].equals("0")) {
                    if (ci == 0) {
                        System.out.println("0 0");
                        break;
                    }
                    System.out.println(ci + " " + (sum / ci));
                    break;
                }
                int shuhao = Integer.parseInt(s[0]);
                if (s[1].equals("S")) {
                    list[shuhao] = new shu(s[0], s[1], s[2]);
                } else if (s[1].equals("E")) {
                    if (list[shuhao] != null) {
                        if (list[shuhao].caozuo.equals("S")) {
                            String[] times = list[shuhao].shijian.split(":");
                            int ss = Integer.parseInt(times[0]);
                            int sf = Integer.parseInt(times[1]);
                            String[] timee = s[2].split(":");
                            int es = Integer.parseInt(timee[0]);
                            int ef = Integer.parseInt(timee[1]);
                            ci++;
                            sum += (es - ss) * 60 + (ef - sf);
                        }
                    }
                }
            }
        }
    }
}
