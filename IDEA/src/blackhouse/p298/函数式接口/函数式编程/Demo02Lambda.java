package blackhouse.p298.函数式接口.函数式编程;

/*
使用Lambda表达式优化日志案例
Lambda的特点:延迟减灾
Lambda的适用前提,必须有函数式接口
  */
public class Demo02Lambda {
    public static void showLog(int lever, MessageBuilder mb) {
        if (lever == 1) {
            System.out.println(mb.buildermessage());
        }
    }

    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();

        String msg1 = "Hello1";
        String msg2 = "Hello2";
        String msg3 = "Hello3";
        //调用showLog方法
        showLog(2, () -> {
            return msg1 + msg2 + msg3;
        });
        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l1);
    }

}
