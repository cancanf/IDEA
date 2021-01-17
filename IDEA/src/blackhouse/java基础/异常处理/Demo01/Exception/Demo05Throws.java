package blackhouse.java基础.异常处理.Demo01.Exception;

import java.io.IOException;

public class Demo05Throws {
    public static void main(String[] args) throws IOException {
        readFile("c\\a.tx");
    }

    public static void readFile(String FileName) throws IOException {
//        if(!FileName.equals("c\\a.txt")){
//            throw new FileNotFoundException("传递的文件路径不对");
//        }
        if (!FileName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径正常");
    }
}
