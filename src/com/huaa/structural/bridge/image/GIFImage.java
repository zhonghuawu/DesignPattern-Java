package com.huaa.structural.bridge.image;

import com.huaa.structural.bridge.Matrix;

public class GIFImage extends Image {
    @Override
    public void parseFile(String filename) {
        Matrix matrix = new Matrix() {
        };
        imp.doPaint(matrix);
        System.out.println("filename: " + filename + ", gif");
    }
}
