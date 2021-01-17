package blackhouse.java基础.文件操作.获取路径;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        //show01();
        show02();
        ;
    }

    private static void show02() {
        File f1 = new File("C:\\Users\\精神小伙\\Desktop\\JAVA\\4.png");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);

        File f2 = new File("4.png");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);

        String name = f1.getName();
        System.out.println(name);

        String path = f1.getPath();
        System.out.println(path);
    }

    private static void show01() {

        File f1 = new File("C:\\Users\\精神小伙\\Desktop\\JAVA\\4.png");
        long l1 = f1.length();
        System.out.println(l1);
        File f2 = new File("C:\\Users\\精神小伙\\Desktop\\JAVA\\125.png");
        long l2 = f2.length();
        System.out.println(l2);

    }
}
