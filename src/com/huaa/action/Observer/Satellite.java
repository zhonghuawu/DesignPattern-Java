package com.huaa.action.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * This class defines
 * 
 * @author Huaa
 * @date 2018-06-23 10:55
 * @version 1.0
 */
public class Satellite implements Observer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		String weather = (String) arg;
		System.out.println("weather change to:" + weather);
	}

}
