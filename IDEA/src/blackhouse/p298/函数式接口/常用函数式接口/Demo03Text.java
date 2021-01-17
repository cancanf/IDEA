package blackhouse.p298.函数式接口.常用函数式接口;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;

public class Demo03Text {
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String s :
                arr) {
            con1.accept(s);
            con2.accept(s);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"1,2", "3,4", "4,5"};
        printInfo(arr,
                (message) -> {
                    String name = message.split(",")[0];
                    System.out.print("姓名: " + name);
                },
                (message) -> {
                    String age = message.split(",")[1];
                    System.out.println("," + "年龄" + age + ".");
                });

    }
}
