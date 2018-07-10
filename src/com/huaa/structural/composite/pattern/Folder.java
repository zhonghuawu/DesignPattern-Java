package com.huaa.structural.composite.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @auther: Huaa
 * @create: 2018-07-11 0:26
 */
public class Folder extends AbstractFile {
    private String name;

    private List<AbstractFile> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("folder " + name + " kill virus");
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}