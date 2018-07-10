package com.huaa.structural.composite.pattern;

/**
 * Description:
 *
 * @auther: Huaa
 * @create: 2018-07-11 0:23
 */
public class TextFile extends AbstractFile {
    private String name;

    public TextFile(String name) {
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
        System.out.println("text file " + name + " kill virus");
    }
}