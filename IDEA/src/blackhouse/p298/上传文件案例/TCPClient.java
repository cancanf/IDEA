package blackhouse.p298.上传文件案例;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建客户端对象Socket
        Socket socket = new Socket("127.0.0.1", 8887);
        //创建网络输出流的OutputStream
        OutputStream outputStream = socket.getOutputStream();
        //创建本地输入流对象,上传本地文件
        FileInputStream fis = new FileInputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\p298后\\上传文件案例\\3.png");

        byte[] bytes = new byte[1024];
        int len;
        //使用本地 字节输入流进行读取本地文件
        System.out.println("1111111111");
        while ((len = fis.read(bytes)) != -1) {
            //用网络字节输出流把读取到的上传到服务器
            outputStream.write(bytes, 0, len);
        }
        socket.shutdownOutput();
        System.out.println("2222222222");
        //获得网络字节输入流对象
        InputStream inputStream = socket.getInputStream();
        System.out.println("44444444444");
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        System.out.println("555555555555");
        //释放资源
        socket.close();
        fis.close();
        outputStream.close();

    }
}
