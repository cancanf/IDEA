package blue.PTA.选拔赛;

import java.util.Scanner;

public class 回形针 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] chars = in.nextLine().toCharArray();
        int n = 1;
        while (n * n < chars.length) {
            n++;
        }
        char[][] shuzu = new char[n][n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (k < chars.length) {
                    shuzu[i][j] = chars[k];
                    System.out.println(shuzu[i][j]);
                    k++;
                } else {
                    shuzu[i][j] = ' ';
                }
            }

        }
        String fx = "you";
        int i = 0, j = 0;
        int ci = 0, ceng = 0;
        for (int l = 0; l < n * n; l++) {
            System.out.println(shuzu[i][j]);
            ci++;
            if (fx.equals("you")) {
                j++;
            } else if (fx.equals("xia")) {
                i++;
            } else if (fx.equals("zuo")) {
                j--;
            } else if (fx.equals("shang")) {
                i--;
            }
//            if(i ==  && j==n-1){
//                fx = "xia";
//            }else if(i==n-1 && j == n-1){
//                fx = "zuo";
//            }else if(i && j == ){
//                fx = "zuo";
//
//            }
        }


    }
}
