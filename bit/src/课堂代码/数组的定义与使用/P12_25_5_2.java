package 课堂代码.数组的定义与使用;

public class P12_25_5_2 {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5};
        System.out.println(sum(ints));
    }

    private static int sum(int[] ints) {
        int sum=0;
        for (int i = 0; i < ints.length; i++) {
            sum+=ints[i];
        }
        return sum;
    }
}
