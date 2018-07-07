package com.huaa.structural.bridge.os;

import com.huaa.structural.bridge.Matrix;

public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("show image in unix os");
    }
}
