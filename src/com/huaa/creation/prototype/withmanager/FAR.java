package com.huaa.creation.prototype.withmanager;

public class FAR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("cannot cloned");
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("Feasibility Analysis Report");
    }
}
