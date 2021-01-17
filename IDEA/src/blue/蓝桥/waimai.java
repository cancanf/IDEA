package blue.蓝桥;

import java.util.Scanner;

public class waimai {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N, M, T, ts, id;//依次是店铺数量,订单数量,给定时刻,订单信息:ts时刻编号为id的店铺的订单
        int k = 0;//k为T时刻在优先缓存的店铺数量

        N = in.nextInt();//店铺数量
        M = in.nextInt();//订单数量
        T = in.nextInt();//给定时刻

        dianpu[] dianpu = new dianpu[N];
        dingdan[] dingdan = new dingdan[M];

        for (int i = 0; i < N; i++) {
            dianpu[i] = new dianpu(i, 0, 0);
        }

        for (int i = 0; i < M; i++) {//店铺初始化和订单录入
            ts = in.nextInt();
            id = in.nextInt();
            dingdan[i] = new dingdan(ts, id);

        }

        for (int i = 1; i <= T; i++) {//每一个时间单位

            for (int j = 0; j < M; j++) {//遍历订单信息 j = 第几个订单
                if (i == dingdan[j].getTs()) {//检查订单时间相同的
                    //相应订单的id-1 = 相应店铺角码
                    int temp = dingdan[j].getId() - 1;
                    //相应店铺订单数+1
                    dianpu[temp].setDingdanshu(dianpu[temp].getDingdanshu() + 1);
                }
            }
            //一个时间单位订单遍历完毕,结算优先度.
            for (int j = 0; j < N; j++) {//遍历店铺

                if (dianpu[j].getDingdanshu() == 0 && dianpu[j].getYouxianji() > 0) {//订单数为0,优先级不为0
                    dianpu[j].setYouxianji(dianpu[j].getYouxianji() - 1);//优先级-1
                } else if (dianpu[j].getDingdanshu() > 0) {//订单数不为0
                    dianpu[j].setYouxianji(dianpu[j].getYouxianji() + 2);//优先级+2
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (dianpu[i].getYouxianji() > 5) {
                k++;
            }
        }
        System.out.println("优先级里面有" + k + "个");


    }


    public static class dingdan {
        int id, ts;

        public dingdan() {
        }

        public dingdan(int ts, int id) {
            this.id = id;
            this.ts = ts;
        }

        public int getId() {
            return id;
        }

        public int getTs() {
            return ts;
        }
    }

    public static class dianpu {
        int id, dingdanshu, youxianji;

        public dianpu(int id, int dingdanshu, int youxianji) {
            this.id = id;
            this.dingdanshu = dingdanshu;
            this.youxianji = youxianji;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getDingdanshu() {
            return dingdanshu;
        }

        public void setDingdanshu(int dingdanshu) {
            this.dingdanshu = dingdanshu;
        }

        public int getYouxianji() {
            return youxianji;
        }

        public void setYouxianji(int youxianji) {
            this.youxianji = youxianji;
        }
    }
}



