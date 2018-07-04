package com.huaa.creation.factoryMethod;

public interface LoggerFactory {
    Logger createLogger();

    // improvement
    Logger createLogger(String args);
    Logger createLogger(Object obj);
}
