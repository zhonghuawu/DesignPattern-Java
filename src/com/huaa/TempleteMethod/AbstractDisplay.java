package com.huaa.TempleteMethod;
/**
 * This class defines 
 * 
 * @author Huaa
 * @date 2018-06-23 10:38
 * @version 1.0
 */
public abstract class AbstractDisplay {
	
	public abstract void open();
	public abstract void print();
	public abstract void close();
	
	public final void display() {
		open();
		print();
		close();
	}

}
