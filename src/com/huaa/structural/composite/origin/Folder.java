package com.huaa.structural.composite.origin;

import com.huaa.structural.bridge.image.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @auther: Huaa
 * @create: 2018-07-10 23:26
 */
public class Folder {
    private String name;

    private List<Folder> folderList = new ArrayList<>();
    private List<ImageFile> imageFileList = new ArrayList<>();
    private List<TextFile> textFileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFolder(Folder f) {
        folderList.add(f);
    }

    public void addImageFile(ImageFile imageFile) {
        imageFileList.add(imageFile);
    }

    public void addTextFile(TextFile textFile) {
        textFileList.add(textFile);
    }

    public void killVirus() {
        System.out.println("folder " + name + " kill virus");
        for (Folder f : folderList) {
            f.killVirus();
        }
        for (ImageFile file : imageFileList) {
            file.killVirus();
        }
        for (TextFile file : textFileList) {
            file.killVirus();
        }
    }
}