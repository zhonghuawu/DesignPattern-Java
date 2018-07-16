package com.huaa.action.TempleteMethod;

/**
 * This class defines
 * 
 * @author Huaa
 * @date 2018-06-23 10:39
 * @version 1.0
 */
public class CharDisplay extends AbstractDisplay {

	private char ch;

	public CharDisplay(char ch) {
		// TODO Auto-generated constructor stub
		this.ch = ch;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.huaa.action.TempleteMethod.AbstractDisplay#open()
	 */
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("<<");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.huaa.action.TempleteMethod.AbstractDisplay#print()
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(ch);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.huaa.action.TempleteMethod.AbstractDisplay#close()
	 */
	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println(">>");
	}

}
