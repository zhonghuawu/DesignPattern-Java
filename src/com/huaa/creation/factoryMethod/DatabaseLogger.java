package com.huaa.creation.factoryMethod;

public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("database logger");
    }
}
