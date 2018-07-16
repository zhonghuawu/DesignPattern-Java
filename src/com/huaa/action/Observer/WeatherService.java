package com.huaa.action.Observer;
/**
 * This class defines 
 * 
 * @author Huaa
 * @date 2018-06-23 10:58
 * @version 1.0
 */
public class WeatherService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Earth earth = new Earth();
		Satellite satellite = new Satellite();
		
		earth.addObserver(satellite);
		System.out.println("Weather prediction: ");
		System.out.println("-------------------------");
		earth.setWeather("typhoon is coming");
		earth.setWeather("storm");
		earth.setWeather("very hot");
	}

}
