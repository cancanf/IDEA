package blackhouse.java基础.Lambda表达式.练习.无参数无返回值;

public class InvokeCook {

    public static void invokeCook(Lambda表达式.练习.无参数无返回值.Cook cook) {
        cook.makeFood();
    }

    public static void main(String[] args) {

        invokeCook(new Lambda表达式.练习.无参数无返回值.Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });
        //lambda表达式形式
        invokeCook(() -> {
            System.out.println("吃饱了");
        });
        //省略格式
        invokeCook(() -> System.out.println("吃多了"));
    }


}
