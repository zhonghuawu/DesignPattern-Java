package com.huaa.structural.composite.pattern;

/**
 * Description:
 *
 * @auther: Huaa
 * @create: 2018-07-11 0:30
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile folder1 = new Folder("sunny material");
        AbstractFile folder2 = new Folder("image file");
        AbstractFile folder3 = new Folder("text file");

        AbstractFile imageFile1 = new ImageFile("huaa.jpg");
        AbstractFile imageFile2 = new ImageFile("zzh.jpg");

        AbstractFile textFile1 = new TextFile("huaa.txt");
        AbstractFile textFile2 = new TextFile("zzh.txt");

        folder2.add(imageFile1);
        folder2.add(imageFile2);
        folder3.add(textFile1);
        folder3.add(textFile2);
        folder1.add(folder2);
        folder1.add(folder3);

        folder1.killVirus();

        folder2.killVirus();
    }
}