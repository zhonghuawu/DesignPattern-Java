package com.huaa.TempleteMethod;

/**
 * This class defines
 * 
 * @author Huaa
 * @date 2018-06-23 10:43
 * @version 1.0
 */
public class StringDisplay extends AbstractDisplay {

	private String str;

	public StringDisplay(String str) {
		this.str = str;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.huaa.TempleteMethod.AbstractDisplay#open()
	 */
	@Override
	public void open() {
		// TODO Auto-generated method stub
		printLine();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.huaa.TempleteMethod.AbstractDisplay#print()
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("|" + str + "|");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.huaa.TempleteMethod.AbstractDisplay#close()
	 */
	@Override
	public void close() {
		// TODO Auto-generated method stub
		printLine();
	}

	public void printLine() {
		System.out.println("************************");
	}

}
