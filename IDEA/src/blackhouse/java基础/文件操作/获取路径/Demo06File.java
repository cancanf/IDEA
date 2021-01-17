package blackhouse.java基础.文件操作.获取路径;

import java.io.File;

public class Demo06File {

    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        File f1 = new File("C:\\Users\\精神小伙\\Desktop\\JAVA");
        File[] arr = f1.listFiles();
        for (File f : arr
        ) {
            System.out.println(f);
        }
    }

    private static void show01() {
        File f1 = new File("C:\\Users\\精神小伙\\Desktop\\JAVA");
        String[] arr = f1.list();
        for (String fileName : arr) {
            System.out.println(fileName);
        }
    }
}
