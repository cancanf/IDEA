package blackhouse.java基础.文件操作.获取路径;

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {

        show01();
    }

    private static void show01() {
        File f1 = new File("C:\\Users\\精神小伙\\Desktop\\JAVA\\4.png");
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println("_______________________________");
        File f2 = new File("C:\\Users\\精神小伙\\Desktop\\JAVA");
        System.out.println(f2.exists());
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println("_______________________________");
        File f3 = new File("C:\\Users\\精神小伙\\Desktop\\JAVA\\14.png");
        System.out.println(f3.exists());
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println("_______________________________");
    }
}
