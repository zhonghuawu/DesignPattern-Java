package com.huaa.creation.abstractFactory;

import com.huaa.Util.XMLUtil;

public class Client {
    public static void main(String[] args) {
        SkinFactory factory;
        Button button;
        TextField textField;
        ComboBox comboBox;
        factory = (SkinFactory) XMLUtil.getBean("D:\\Github\\DesignPattern-Java\\src\\com\\huaa\\creation\\abstractFactory\\config.xml");
        button = factory.createButton();
        textField = factory.createTextField();
        comboBox = factory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}
