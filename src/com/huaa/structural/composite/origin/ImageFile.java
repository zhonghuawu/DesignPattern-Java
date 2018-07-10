package com.huaa.structural.composite.origin;

/**
 * Description:
 *
 * @auther: Huaa
 * @create: 2018-07-10 23:23
 */
public class ImageFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println("image file " + name + " killing virus");
    }
}