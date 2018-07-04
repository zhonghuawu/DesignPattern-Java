package com.huaa.creation.factoryMethod;

public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        // connecting database, default ways
        // new database logger instance
        Logger logger = new DatabaseLogger();
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        // connect database use args
        Logger logger = new DatabaseLogger();
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        // connect database use obj
        Logger logger = new DatabaseLogger();
        return logger;
    }
}
