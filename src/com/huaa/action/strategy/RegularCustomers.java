package com.huaa.action.strategy;

/**
 * This class defines
 * 
 * @author Huaa
 * @date 2018-06-23 10:32
 * @version 1.0
 */
public class RegularCustomers implements Strategy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.huaa.action.strategy.Strategy#calcPrice(double)
	 */
	@Override
	public double calcPrice(double goodsPrice) {
		// TODO Auto-generated method stub
		System.out.println("regular customer discounts 5% normally");
		return goodsPrice * (1 - 0.05);
	}

}
