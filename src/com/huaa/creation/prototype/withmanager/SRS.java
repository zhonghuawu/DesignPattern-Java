package com.huaa.creation.prototype.withmanager;

public class SRS implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("cannot cloned");
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("Software Requirement Specification");
    }
}
