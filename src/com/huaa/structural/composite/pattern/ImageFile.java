package com.huaa.structural.composite.pattern;

import com.huaa.structural.bridge.image.Image;

/**
 * Description:
 *
 * @auther: Huaa
 * @create: 2018-07-11 0:20
 */
public class ImageFile extends AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("do not support this method");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("do not support this method");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("do not support this method");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("image file " + name + " kill virus");
    }
}