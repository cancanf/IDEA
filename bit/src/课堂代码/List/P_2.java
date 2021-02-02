package 课堂代码.List;

public class P_2 {
    public static void main(String[] args) {
        int[] a = {3, 3, 6, 5, -2, 2, 5, 1, -9, 4};
        System.out.println(canThreePartsEqualSum(a));
    }

    public static boolean canThreePartsEqualSum(int[] arr) {
//        int sum = 0;
//        for (int i :
//                arr) {
//            sum += i;
//        }
//        if(sum%3!=0){
//            return false;
//        }
//        int sum13 = sum/3;
//        int cur = 0;
//        int i = 0;
//        for (; i < arr.length; i++) {
//            cur += arr[i];
//            if(cur == sum13){
//                break;
//            }
//        }
//        if(cur!=sum13){
//            return false;
//        }
//        cur = 0;
//        for (int j = i+1; j < arr.length;j++){
//            cur += arr[j];
//            if(cur == sum13){
//                return true;
//            }
//        }
//        return false;
//
//
//    }

        int sum = 0;
        for (int i :
                arr) {
            sum += i;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int i = 0, j = arr.length - 1;
        int ansleft = arr[0], ansright = arr[arr.length - 1];
        while (i + 1 < j) {
            if (ansleft == sum / 3 && ansright == sum / 3) {
                return true;
            }

            if (ansleft != sum / 3) {
                ansleft += arr[++i];
                ;
            }
            if (ansright != sum / 3) {
                ansright += arr[--j];
            }
        }
        return false;
    }
}
