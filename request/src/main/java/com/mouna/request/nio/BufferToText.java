package com.mouna.request.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferToText {

    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {

        FileChannel fc = new FileOutputStream("").getChannel();
        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        fc.close();
        fc = new FileInputStream("data2.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();

        System.out.println(buff.asCharBuffer());


    }
}
