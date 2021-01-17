package blue.PTA.不明;

import java.util.Scanner;

public class L1_002 {
    public static void main(String[] args) {
        int hang, yu = 0, n, sum = 1;
        String fu;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        fu = in.next();
        //计算从第一行到中间1的行数
        for (hang = 1; hang < 1000; hang++) {

            sum += 2 * (2 * hang + 1);//
            if (n / sum < 1) {
                //图形使用的符号数量
                sum -= 2 * (2 * hang + 1);
                //剩余的符号数量
                yu = n - sum;
                break;
            }
        }

        //倒序输出部分(包括中间)
        for (int j = hang; j > 0; j--) {//控制行数和换行
            for (int i = 0; i < ((2 * hang - 1) - (2 * j - 1)) / 2; i++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * j - 1; k++) {//控制每行输出的符号数
                System.out.printf(fu);
            }
            System.out.println();
        }

        //正序输出部分(不包括中间)
        for (int k = 2; k <= hang; k++) {//行数(不包括中间行)
            for (int i = 0; i < ((2 * hang - 1) - (2 * k - 1)) / 2; i++) {
                System.out.print(" ");
            }
            for (int l = 0; l < 2 * k - 1; l++) {//每行符号数与行相关
                System.out.print(fu);
            }
            System.out.println();
        }
        System.out.println(yu);
    }
}
