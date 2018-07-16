package com.huaa.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Component component = new Window();
        Component componentSB = new ScrollBarDecorator(component);
        Component componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
    }
}
