package com.mouna.request.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelCopy {

    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
//        if(args.length != 2){
//            System.out.println("arguments: sourcefile destfile");
//            System.exit(1);
//        }
        FileChannel in = new FileInputStream("E:/document/data.txt").getChannel();
        FileChannel out = new FileOutputStream("E:/document/data.txt").getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        while (in.read(buffer) != -1){
            buffer.flip();
            out.write(buffer);
            buffer.clear();
        }
        in.close();
        out.close();
    }
}
