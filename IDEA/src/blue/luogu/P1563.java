package blue.luogu;

import java.util.Scanner;

public class P1563 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m;
        n = in.nextInt();//小人的个数
        m = in.nextInt();//指令的条数
        person[] person = new person[n];
        for (int i = 0; i < n; i++) {//输入小人的朝向和职业
            int temp = in.nextInt();//临时借用
            String str = in.next();
            person[i] = new person(temp, str);
        }
        int ji = 0;//作为移动时候的角标

        for (int i = 0; i < m; i++) {//输入指令 方向和个数
            int f, ge;
            f = in.nextInt();//方向
            ge = in.nextInt();//移动个数
            if (person[ji].chaoxiang == 0 && f == 0) {//移动方向判断
                ji -= ge;
            } else if (person[ji].chaoxiang == 0 && f == 1) {
                ji += ge;
            } else if (person[ji].chaoxiang == 1 && f == 0) {
                ji += ge;
            } else if (person[ji].chaoxiang == 1 && f == 1) {
                ji -= ge;
            }
            while (ji < 0 || ji >= n) {
                if (ji < 0) {//防止数组越界
                    ji += n;
                } else if (ji >= n) {
                    ji -= n;
                }
            }
        }
        System.out.println(person[ji].name);

    }

    public static class person {
        int chaoxiang;
        String name;

        public person(int fangx, String name) {
            this.chaoxiang = fangx;
            this.name = name;
        }

        public int getChaoxiang() {
            return chaoxiang;
        }

        public void setChaoxiang(int chaoxiang) {
            this.chaoxiang = chaoxiang;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
