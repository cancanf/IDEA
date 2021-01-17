package blackhouse.IO流.输出流;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\1.txt");
        fos.write(97);
        fos.close();
    }
}
