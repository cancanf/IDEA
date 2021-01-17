package blackhouse.IO流.输出流;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        //创建FileWrite对象,构造方法绑定要写入数据的目的地
        FileWriter fw = new FileWriter("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\输出流\\1.txt");
        //使用FileWrite中的方法write,吧数据存入到内存缓冲区中(字符转换为字节的过程)
        fw.write(98);
        //使用flush方法把内存缓冲区的数据,刷新到文件中
        //fw.flush();
        //关闭前会自动刷新
        fw.close();
    }
}
