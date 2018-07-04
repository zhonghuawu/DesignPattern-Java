package com.huaa.creation.prototype;

import java.io.Serializable;

public class Attachment implements Serializable {

    private static final long serialVersionUID = -1635877563012288095L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("download attachment: " + name);
    }
}
