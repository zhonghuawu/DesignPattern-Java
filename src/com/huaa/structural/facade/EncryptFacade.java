package com.huaa.structural.facade;

public class EncryptFacade {
    private MyFileReader reader;
    private MyFileWriter writer;
    private CipherMachine cipher;

    public EncryptFacade() {
        reader = new MyFileReader();
        writer = new MyFileWriter();
        cipher = new CipherMachine();
    }

    public void fileEncrypt(String filenameSrc, String filenameDes) {
        String plainStr = reader.read(filenameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, filenameDes);
    }
}
