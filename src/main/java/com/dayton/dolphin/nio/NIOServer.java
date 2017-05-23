package com.dayton.dolphin.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by bruce on 17-5-19.
 */
public class NIOServer {

    private static ServerSocketChannel server;
    private static int port = 7280;
    //多路复用器
    private static Selector selector;
    //信息写入
    ByteBuffer reBuffer = ByteBuffer.allocate(1024);
    //信息写出
    ByteBuffer sendBuffer = ByteBuffer.allocate(1024);
    //维护一个实际上是一个事件标签的集合
    Map<SelectionKey, String> sessionMsg = new HashMap<SelectionKey, String>();

    public NIOServer(int port) throws IOException {
        this.port = port;
        //1. 打开通道
        server = ServerSocketChannel.open();
        //2. 设置监听端口
        server.socket().bind(new InetSocketAddress(this.port));
        //3. 设置非阻塞(默认为阻塞)
        server.configureBlocking(false);
        //4. 打开多路复用
        selector = Selector.open();
        //5. 通道注册多路复用器
        server.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("NIO服务已经启动，监听端口： "+this.port);
    }

    /**
     * 进行监听
     * @throws IOException
     */
    public void listener() throws IOException {
        //轮询
        while(true){
            //通过selector查看是否有注册事件
            int eventCount = selector.select();
            if (eventCount<=0){
                continue;//没有则继续轮询
            }
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = keys.iterator();
            while (iterator.hasNext()){
                //处理请求
                SelectionKey selectionKey = iterator.next();
                process(selectionKey);
                iterator.remove();
            }
        }
    }

    /**
     * 处理请求
     * @param selectionKey
     */
    public void process(SelectionKey selectionKey){
        if (selectionKey.isValid() && selectionKey.isAcceptable()){

        }else if (selectionKey.isValid() && selectionKey.isReadable()){

        }else if(selectionKey.isValid() && selectionKey.isWritable()){

        }
    }

    public static void main(String[] args){

    }


}
