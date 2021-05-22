package blackhouse.java基础.HashsetSavePerson;

public class TwstMath {
    public static void main(String[] args) {

        method("er", 20.3, 5, 6, 5, 4);
        int a = method2(1, 5, 6, 8, 4);
        System.out.println(a);

    }


    public static void method(String b, double c, int... a) {//可变参数放最后
    }

    public static int method2(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void method3(Object... o) {
    }
}


