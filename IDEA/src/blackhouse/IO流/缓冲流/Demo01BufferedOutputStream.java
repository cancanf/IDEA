package blackhouse.IO流.缓冲流;

import java.io.*;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileOutputStream对象,构造方法中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\缓冲流\\1.txt");
        //2.创建BufferedOutputStream对象构造方法中传递FileOutputStream对象对象，
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //3.使用BufferedoutputStream对象中的方法write,把数据写入到内部缓冲区中
        bos.write("写入".getBytes());
        //4.使用BufferedoutputStream对象中的方法flush,把内部缓冲区中的数据,刷新到文件中

        bos.close();
    }
}
