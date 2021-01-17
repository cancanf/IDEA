package blackhouse.p298.文件上传优化;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器ServerSocker对象
        ServerSocket serverSocket = new ServerSocket(8887);
        while (true) {
            //获取客户端对象
            Socket accept = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //获得客户端对象的网络字节输入流
                        InputStream inputStream = accept.getInputStream();
                        File file = new File("C:\\Users\\精神小伙\\Desktop\\temp");
                        String fileName = "itcast" + System.currentTimeMillis() + new Random().nextInt(999999) + ".jpg";
                        //本地字节输出流保存到本地磁盘
                        FileOutputStream fos = new FileOutputStream(file + "\\" + fileName);

                        //读取发送的数据
                        byte[] bytes = new byte[1024];
                        int len = 0;

                        while ((len = inputStream.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }
                        //

                        //向客户端返回
                        accept.getOutputStream().write("收到了谢谢 ".getBytes());

                        //释放资源
                        fos.close();
                        accept.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
        }
    }
}
