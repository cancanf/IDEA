package 考试.每日一题.day25;

import java.util.Scanner;

public class shugen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String i = in.nextLine();
            System.out.println(shu(i));
        }
    }

    private static String shu(String i) {
        //递归大于10,将其各位分解相加
        //小于10直接返回
        long total = 0;
        char[] str = i.toCharArray();
        if (i.length() < 2) {
            return i;
        } else {
            for (int j = 0; j < str.length; j++) {
                total += str[j] - '0';
            }
        }
        return shu(String.valueOf(total));
//        if(i<10){
//            return i;
//        }else {
//            while (i >0) {
//                total += i%10;
//                i /= 10;
//            }
//        }
//        return shu(total);
    }
}

