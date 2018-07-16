package com.huaa.structural.facade;

public class Client {
    public static void main(String[] args) {

//        String filenameSrc = "D:\\Github\\DesignPattern-Java\\src\\com\\huaa\\structural\\facade\\test.txt";
        String filenameSrc = "DesignPattern-Java\\src\\com\\huaa\\structural\\facade\\test.txt";
        String filenameDes = "DesignPattern-Java\\src\\com\\huaa\\structural\\facade\\encrypttest.txt";
        EncryptFacade facade = new EncryptFacade();
        facade.fileEncrypt(filenameSrc, filenameDes);
    }
}
