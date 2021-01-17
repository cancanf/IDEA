package blue.PTA.比赛;

import java.util.Scanner;

public class 训练 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] s = in.nextLine().split(" ");
        String[] zhan = new String[30];
        double sum = 0;
        int size = 0;

        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i].equals("+")) {
                sum = Double.parseDouble(zhan[size - 1]) + Double.parseDouble(zhan[size - 2]);
                size -= 2;
                zhan[size++] = sum + "";
            } else if (s[i].equals("-")) {
                sum = Double.parseDouble(zhan[size - 1]) - Double.parseDouble(zhan[size - 2]);//弹出要删除
                size -= 2;
                zhan[size++] = sum + "";
            } else if (s[i].equals("*")) {
                sum = Double.parseDouble(zhan[size - 1]) * Double.parseDouble(zhan[size - 2]);
                size -= 2;
                zhan[size++] = sum + "";
            } else if (s[i].equals("/")) {
                sum = Double.parseDouble(zhan[size - 1]) / Double.parseDouble(zhan[size - 2]);
                size -= 2;
                zhan[size++] = sum + "";
            } else {
                zhan[size++] = s[i];
            }
        }
        System.out.println(String.format("%.1f", sum));
    }
}
