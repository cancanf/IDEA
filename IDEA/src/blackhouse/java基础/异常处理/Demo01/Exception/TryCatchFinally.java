package blackhouse.java基础.异常处理.Demo01.Exception;

import java.io.IOException;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            readFile("d:\\a.txa");
        } catch (IOException e) {

            e.printStackTrace();//重写Objext的toString java.in.IOException:文件的后缀名不对
        } finally {
            System.out.println("资源释放，");
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
