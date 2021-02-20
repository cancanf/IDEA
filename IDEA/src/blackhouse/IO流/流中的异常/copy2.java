package blackhouse.IO流.流中的异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy2 {
    public static void main(String[] args) throws IOException {
        long st1 = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\JAVA\\IDEA项目\\IDEA\\src\\blackhouse\\IO流\\复制文件案例\\01.png");
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\IDEA项目\\IDEA\\src\\blackhouse\\IO流\\复制文件案例\\02.png");
        byte[] bytes = new byte[1024];
        while ((fis.read(bytes)) != -1) {
            fos.write(bytes);
        }
        fis.close();
        fos.close();

        long st2 = System.currentTimeMillis();
        System.out.println(st2 - st1);
    }
}
