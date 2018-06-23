package com.huaa.Observer;

import java.util.Observable;

/**
 * This class defines 
 * 
 * @author Huaa
 * @date 2018-06-23 10:52
 * @version 1.0
 */
public class Earth extends Observable {
	private String weather = "sunny";
	
	public String getWeather() {
		return weather;
	}
	public void setWeather (String weather) {
		this.weather = weather;
		setChanged();
		notifyObservers(weather);
	}
}
