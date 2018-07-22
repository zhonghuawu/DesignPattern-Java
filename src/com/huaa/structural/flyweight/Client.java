package com.huaa.structural.flyweight;

public class Client {

    public static void main(String[] args) {
        IgoChessman black1, black2, black3;
        IgoChessman write1, write2;

        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();

        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");

        write1 = factory.getIgoChessman("w");
        write2 = factory.getIgoChessman("w");

        black1.display(new Coordinates(1, 2));
        black2.display(new Coordinates(3, 4));
        black3.display(new Coordinates(1, 4));

        write1.display(new Coordinates(3, 5));
        write2.display(new Coordinates(6, 2));

    }
}
