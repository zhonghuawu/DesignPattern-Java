package com.huaa.structural.facade;

import java.io.*;

public class MyFileReader {

    public String read(String fileName) {
        StringBuffer result = new StringBuffer();
        try {
            System.out.println("read file: " + fileName);
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int lineNo = 1;
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("" + lineNo++ + ": " + line);
                result.append(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println(fileName + " not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("io exception");
            e.printStackTrace();
        }
        return result.toString();
    }
}
