package com.huaa.structural.bridge;

import com.huaa.structural.bridge.image.GIFImage;
import com.huaa.structural.bridge.image.Image;
import com.huaa.structural.bridge.os.ImageImp;
import com.huaa.structural.bridge.os.WindowsImp;

public class Client {
    public static void main(String[] args) {
        Image image = new GIFImage();
        ImageImp imp = new WindowsImp();
        image.setImageImp(imp);
        image.parseFile("file.gif");
    }
}
