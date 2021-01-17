package blackhouse.IO流.转换流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        write_utf_8();
    }

    private static void write_utf_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\转换流\\1.txt"), "gbk");
        osw.write("你好");
        osw.close();

    }
}
