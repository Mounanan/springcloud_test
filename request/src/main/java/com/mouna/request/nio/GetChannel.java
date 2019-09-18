package com.mouna.request.nio;

import org.springframework.util.StreamUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {

    private static final int BSIZE = 1024;

    public static void main(String[] args) throws IOException {
//        StreamUtils.copy();

        FileChannel fc = new FileOutputStream("E:/document/data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        fc.close();
        fc = new RandomAccessFile("E:/document/data.txt", "rw").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        while (buff.hasRemaining()){
            System.out.println(buff.get());
        }
        fc.close();
    }

}
