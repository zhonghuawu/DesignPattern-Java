package com.huaa.creation.factoryMethod;

import com.huaa.Util.XMLUtil;

public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
//        factory = new FileLoggerFactory();
        factory = (LoggerFactory) XMLUtil.getBean("D:\\Github\\DesignPattern-Java\\src\\com\\huaa\\creation\\factoryMethod\\config.xml");

        logger = factory.createLogger();
        logger.writeLog();
    }
}
