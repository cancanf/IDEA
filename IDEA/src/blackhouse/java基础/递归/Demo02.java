package blackhouse.java基础.递归;

import java.io.File;

public class Demo02 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\精神小伙\\Desktop\\JAVA");
        get(f1);
    }

    private static void get(File dir) {

        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    get(f);
                } else {
                    if (f.getName().toLowerCase().endsWith(".java")) {
                        System.out.println(f);
                    }
                }
            }
        }
    }
}
