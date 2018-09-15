package com.huaa.structural.facade;

public class CipherMachine {
    public String encrypt(String plainText) {
        StringBuffer result = new StringBuffer();
        System.out.println("com.huaa.learning.data encrypt");
        byte[] bytes = plainText.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            result.append(bytes[i] % 13);
        }
        return result.toString();
    }
}
