package blackhouse.java基础.文件操作.获取路径;

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) {

        //show01();
        show02();

    }

    private static void show02() {
        File f1 = new File("C:\\Users\\精神小伙\\Desktop\\JAVA\\30");
        boolean b1 = f1.mkdir();
        System.out.println(b1);
        File f2 = new File("C:\\Users\\精神小伙\\Desktop\\JAVA\\20\\30\\40");
        boolean b2 = f2.mkdirs();
        System.out.println(b2);

    }

    private static void show01() {
        File f1 = new File("C:\\Users\\精神小伙\\Desktop\\JAVA\\1.txt");
        boolean b1 = false;
        try {
            b1 = f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(b1);
    }
}
