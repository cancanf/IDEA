package 课堂代码.程序逻辑作业;

import java.util.Scanner;

public class P12_14_3_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        while(i!=0){
            System.out.println(i%10);
            i/=10;
        }
    }
}
