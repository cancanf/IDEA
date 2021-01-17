package blackhouse.java基础.异常处理.Demo01.Exception;

import java.io.IOException;

public class Demo01TryCatch {
    public static void main(String[] args) {
        try {
            readFile("d:\\a.txa");
        } catch (IOException e) {
            System.out.println(e.getMessage());//文件的后缀名不对
            System.out.println(e.toString());//java.io.IOException: 文件的后缀名不对
            e.printStackTrace();//重写Objext的toString java.in.IOException:文件的后缀名不对
        }
        System.out.println("后续代码");
    }

    private static void readFile(String FileName) throws IOException {
        if (!FileName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径正常");
    }
}