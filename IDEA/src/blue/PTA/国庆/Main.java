package blue.PTA.国庆;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, jishu = 1;
        a = in.nextInt();
        String str;
        boolean flag = true;
        System.out.println();
        while (true) {
            str = in.next();
            if (jishu % (a + 1) == 0 && jishu != 0) {
                System.out.println(str);
            } else if (str.equals("ChuiZi")) {
                System.out.println("Bu");
            } else if (str.equals("JianDao")) {
                System.out.println("ChuiZi");
            } else if (str.equals("Bu")) {
                System.out.println("JianDao");
            } else if (str.equals("End")) {
                flag = false;
                break;
            }
            jishu++;
        }
    }
}
/*
ChuiZi
JianDao
Bu
JianDao
Bu
ChuiZi
ChuiZi
ChuiZi
JianDao
Bu
JianDao
Bu
ChuiZi
ChuiZi
End


* */