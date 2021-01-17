package blackhouse.p298.web;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建一个服务器ServerSocket和系统要指定的端口号，
        ServerSocket server = new ServerSocket(8080);
        //使用accept方法获取到请求的客户端对象(浏览器)
        Socket socket = server.accept();
        //使用Socjer对象的方法getInputStream,获取到网络字节输入流InoutStream对象
        InputStream is = socket.getInputStream();
        //使用网络字节输入流InputStream对象中的方法reda读取客户端的请求信息
//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len = is.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }
        //把is网络字节输入流对象,转换为字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        //把客户端请求信息的第一行读取出来GET /11 _Net/web/ index.html HTTP/1.1
        String line = br.readLine();
        //把读取的信息进行切割,只要中间部分/11_ Net/web/index. html
        String[] arr = line.split(" ");
        //把路径前边的/去掉,进行截取11_ _Net/web/index . html
        String htmlpath = arr[1].substring(1);
        //创建一个本地字节输入流,构造方法绑定要读取的html路径
        FileInputStream fis = new FileInputStream(htmlpath);
        OutputStream os = socket.getOutputStream();
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        os.write("\r\n".getBytes());
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        fis.close();
        socket.close();
        server.close();

    }
}
