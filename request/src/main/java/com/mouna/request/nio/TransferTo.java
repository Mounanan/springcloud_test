package com.mouna.request.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class TransferTo {

    public static void main(String[] args) throws IOException {

        FileChannel in = new FileInputStream("E:/document/data.txt").getChannel();
        FileChannel out = new FileOutputStream("E:/document/data.txt").getChannel();
        in.transferTo(0, in.size(), out);
    }
}
