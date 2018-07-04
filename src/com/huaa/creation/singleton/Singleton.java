package com.huaa.creation.singleton;

public class Singleton {

    private Singleton() {
    }

    private static class HolderClass {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        Singleton inst1 = Singleton.getInstance();
        Singleton inst2 = Singleton.getInstance();
        System.out.println(inst1 == inst2);

    }

}
