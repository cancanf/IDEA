package blackhouse.p298.TCP网络通信;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器ServerSocket对象的系统和指定的端口号
        ServerSocket server = new ServerSocket(8888);
        //用accept方法请求到客户端对象accept
        Socket accept = server.accept();
        //获取客户端对象的inputStream对象
        InputStream inputStream = accept.getInputStream();
        //获取并输出客户端传来的数据
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));
        //返回给客服端的数据
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("收到谢谢".getBytes());
        //释放资源
        server.close();
        accept.close();
    }

}
