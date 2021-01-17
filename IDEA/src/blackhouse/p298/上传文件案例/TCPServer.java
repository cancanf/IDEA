package blackhouse.p298.上传文件案例;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器ServerSocker对象
        ServerSocket serverSocket = new ServerSocket(8887);
        //获取客户端对象
        Socket accept = serverSocket.accept();
        //获得客户端对象的网络字节输入流
        InputStream inputStream = accept.getInputStream();
        //本地字节输出流保存到本地磁盘
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\p298后\\上传文件案例\\2.png");

        //读取发送的数据
        byte[] bytes = new byte[1024];
        int len = 0;
        System.out.println("2112313131321");
        while ((len = inputStream.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        //
        System.out.println(22222222);
        //向客户端返回
        accept.getOutputStream().write("收到了谢谢 ".getBytes());

        //释放资源
        fos.close();
        serverSocket.close();
        accept.close();

    }
}
