package com.huaa.structural.facade;

import java.io.*;

public class MyFileWriter {
    public void write(String encryptStr, String fileName) {
        System.out.println("save encrypt text, write to file");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(encryptStr);
            writer.flush();
            writer.close();
        }
        catch (IOException e) {
            System.err.println("io exception");
            e.printStackTrace();
        }
    }
}
