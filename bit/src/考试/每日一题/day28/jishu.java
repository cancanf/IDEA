package 考试.每日一题.day28;

import java.util.Arrays;

public class jishu {
    public static void main(String[] args) {
//        int[] arr = {5, 2};
        int[] arr = {7, 7, 9, 5, 1, 6, 7, 9, 3, 2, 6};
        oddInOddEvenInEven(arr);
    }

    public static void oddInOddEvenInEven(int[] arr) {
      /*
      * 链接：https://www.nowcoder.com/questionTerminal/b89b14a3b5a94e438b518311c5156366
        来源：牛客网
        给定一个长度不小于2的数组arr。 写一个函数调整arr，使arr中*要么*所有的偶数位上都是偶数，*要么*所有的奇数位上都是奇数上。
*       要求：如果数组长度为N，时间复杂度请达到O(N)，额外空间复杂度请达到O(1),下标0,2,4,6...算作偶数位,下标1,3,5,7...算作奇数位，例如[1,2,3,4]调整为[2,1,4,3]即可*/
//        int i = 0, j = 1;
//        while (i < arr.length && j < arr.length) {
//            while (i < arr.length && arr[i] % 2 == 0) {
//                    i += 2;
//            }
//            while (j < arr.length && arr[j] % 2 != 0) {
//                    j += 2;
//            }
//            if (i < arr.length&&j< arr.length) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i+=2;
//                j+=2;
//            }
//        }

        int i = 0, j = 1, len = arr.length;
        while (i < len && j < len) {
            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i += 2;
                j += 2;
                continue;
            }
            if (arr[i] % 2 == 0)
                i += 2;
            if (arr[j] % 2 != 0)
                j += 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
