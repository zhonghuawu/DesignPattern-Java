package com.huaa.structural.composite.origin;

/**
 * Description:
 *
 * @auther: Huaa
 * @create: 2018-07-10 23:21
 */
public class Client {
    public static void main(String[] args) {
        Folder folder1 = new Folder("sunny material");
        Folder folder2 = new Folder("image file");
        Folder folder3 = new Folder("text file");

        ImageFile imageFile1 = new ImageFile("huaa.jpg");
        ImageFile imageFile2 = new ImageFile("zzh.jpg");

        TextFile textFile1 = new TextFile("huaa.txt");
        TextFile textFile2 = new TextFile("zzh.txt");

        folder2.addImageFile(imageFile1);
        folder2.addImageFile(imageFile2);
        folder3.addTextFile(textFile1);
        folder3.addTextFile(textFile2);
        folder1.addFolder(folder2);
        folder1.addFolder(folder3);

        folder1.killVirus();
    }
}