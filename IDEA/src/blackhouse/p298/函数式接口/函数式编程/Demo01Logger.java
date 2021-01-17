package blackhouse.p298.函数式接口.函数式编程;

public class Demo01Logger {

    public static void showLog(int lever, String message) {
        if (lever == 1) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();

        String msg1 = "Hello1";
        String msg2 = "Hello2";
        String msg3 = "Hello3";
        //因为是先拼接了字符串然后作为参数传递进去,如果lever不满足,就是造成了性能的浪费
        showLog(2, msg1 + msg2 + msg3);
        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l1);

    }
}
