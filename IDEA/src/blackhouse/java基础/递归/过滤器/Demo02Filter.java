package blackhouse.java基础.递归.过滤器;

import java.io.File;

public class Demo02Filter {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\精神小伙\\Desktop\\JAVA");
        get(f1);
    }

    private static void get(File dir) {

//            File[] files = dir.listFiles(new FileFilter() {
//                @Override
//                public boolean accept(File pathname) {
//                    return pathname.isDirectory()||
//                            pathname.getName().toLowerCase().endsWith(".java");
//                }
//            });

//            File[] files = dir.listFiles(pathname -> pathname.isDirectory()||
//                    pathname.getName().toLowerCase().endsWith(".java"));

//            File[] files = dir.listFiles(new FilenameFilter() {
//                @Override
//                public boolean accept(File dir, String name) {
//                    return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
//                }
//            }
//            );
        File[] files = dir.listFiles((d, name) ->
                new File(d, name).isDirectory() || name.toLowerCase().endsWith(".java")
        );

        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    get(f);
                } else {
                    System.out.println(f);
                }
            }
        }
    }

}
