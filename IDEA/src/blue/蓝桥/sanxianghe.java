package blue.蓝桥;

public class sanxianghe {
    public static void main(String[] args) {
        long[] longs = new long[]{1, 1, 1, 0};
        int i;
        for (i = 0; i < 20190321; i++) {
            longs[3] = longs[0] + longs[1] + longs[2];
            //提前取余不影响后面四位数字的取值
            longs[3] = longs[3] % 10000;
            longs[0] = longs[1];
            longs[1] = longs[2];
            longs[2] = longs[3];
        }
        System.out.println(i + 3 + " " + longs[3]);

    }
}
