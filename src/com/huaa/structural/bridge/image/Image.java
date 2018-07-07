package com.huaa.structural.bridge.image;

import com.huaa.structural.bridge.os.ImageImp;

public abstract class Image {

    protected ImageImp imp;

    public void setImageImp(ImageImp imageImp) {
        this.imp = imageImp;
    }

    public abstract void parseFile(String filename);

}
