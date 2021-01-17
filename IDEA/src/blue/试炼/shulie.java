package blue.试炼;

public class shulie {
    public static void main(String[] args) {
        long[] longs = new long[20190325];
        longs[0] = 1;
        longs[1] = 1;
        longs[2] = 1;
        for (int i = 3; i <= 7 - 1; i++) {//求6 写5
            longs[i] = longs[i - 1] + longs[i - 2] + longs[i - 3];
            longs[i] = longs[i] % 10000;
        }
        System.out.println(longs[7 - 1]);
    }
}
