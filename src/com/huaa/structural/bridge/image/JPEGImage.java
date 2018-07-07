package com.huaa.structural.bridge.image;

import com.huaa.structural.bridge.Matrix;

public class JPEGImage extends Image {
    @Override
    public void parseFile(String filename) {
        // get a matrix
        Matrix matrix = new Matrix() {
        };
        imp.doPaint(matrix);
        System.out.println("filename: " + filename + ", jpeg");
    }
}
