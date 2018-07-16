package com.huaa.action.TempleteMethod;
/**
 * This class defines 
 * 
 * @author Huaa
 * @date 2018-06-23 10:46
 * @version 1.0
 */
public class DisplayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDisplay chardisplay = new CharDisplay('c');
		AbstractDisplay stringDisplay = new StringDisplay("String");
		chardisplay.display();
		stringDisplay.display();
	}

}
