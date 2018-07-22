package com.huaa.structural.flyweight;

import java.util.Hashtable;

public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();

    private static Hashtable ht;

    private IgoChessmanFactory() {
        ht = new Hashtable();
        IgoChessman black = new BlackIgoChessman();
        IgoChessman write = new WriteIgoChessman();
        ht.put("b", black);
        ht.put("w", write);
    }

    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    public IgoChessman getIgoChessman(String color) {
        return (IgoChessman) ht.get(color);
    }
}
