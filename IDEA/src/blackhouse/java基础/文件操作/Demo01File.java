package blackhouse.java基础.文件操作;

import java.io.File;

public class Demo01File {
/**
 static String pathSeparator与系统有关的路径分隔符，为了方便，它被表示为- -个字符串。
 static char pathSeparatorchar 与系统有关的路径分隔符。
 static String separator 与系统有关的默认名称分隔符，为了方便，它被表示为-一个字符串。
 static char separatorChar 与系统有关的默认名称分隔符。*/

    /**
     * 操作路径:路径不能写死了
     * C: \develop\a\a. txt windows
     * C:/deveLop/a/a.txt L inux
     * "C: "+File. separator+ "develop"+File. separator+"a"+File. separator+"a.txt
     */

    public static void main(String[] args) {
        //路径分隔符 windows ; linux  :
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);
        // 文件名称分隔符 windows 反斜杠 \ ,linux /
        String separator = File.separator;
        System.out.println(separator);
    }
}
