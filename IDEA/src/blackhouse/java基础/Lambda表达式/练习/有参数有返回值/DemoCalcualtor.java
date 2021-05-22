package blackhouse.java基础.Lambda表达式.练习.有参数有返回值;

public class DemoCalcualtor {
    public static void main(String[] args) {
        //匿名内部类
        invokeCalc(10, 20, new Lambda表达式.练习.有参数有返回值.Caiculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });
        //Lambda表达式写法

        invokeCalc(120, 210, (int a, int b) -> {
            return a + b;
        });
        //省略格式
        invokeCalc(120, 210, (a, b) -> a + b);
    }

    private static void invokeCalc(int a, int b, Lambda表达式.练习.有参数有返回值.Caiculator caiculator) {
        int result = caiculator.calc(a, b);
        System.out.println("运算结果是" + result);
    }
}
