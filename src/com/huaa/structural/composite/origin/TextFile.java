package com.huaa.structural.composite.origin;

/**
 * Description:
 *
 * @auther: Huaa
 * @create: 2018-07-10 23:25
 */
public class TextFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println("text file " + name + " kill virus");
    }
}