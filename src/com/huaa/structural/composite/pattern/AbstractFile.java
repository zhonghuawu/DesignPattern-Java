package com.huaa.structural.composite.pattern;

/**
 * Description:
 *
 * @auther: Huaa
 * @create: 2018-07-11 0:19
 */
public abstract class AbstractFile {

    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}