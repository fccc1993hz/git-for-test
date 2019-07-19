package com.fccc.git.tomcat;

import java.io.*;
import java.net.Socket;

/**
 * Created by fccc on 2019/5/23
 */
public class MySocket {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("127.0.0.1",8080);
        OutputStream out =socket.getOutputStream();
        InputStream in = socket.getInputStream();
        boolean autoflush = true;
        PrintWriter writer = new PrintWriter(out,autoflush);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        writer.println("GET /index.jsp HTTP/1.1");
        writer.println("Host: localhost:8080");
        writer.println("Connection: Close");
        writer.println();

        boolean loop = true;
        StringBuffer buffer = new StringBuffer(1024);
        while (loop){
            if(reader.ready()){
                int i=0;
                while (i != -1){
                   i=in.read();
                   buffer.append((char) i);
                }
            loop=false;
            }
            Thread.sleep(50);
        }

        System.out.println(buffer.toString());
        socket.close();

    }
}
