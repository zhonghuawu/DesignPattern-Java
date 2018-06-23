package com.huaa.strategy;
/**
 * This class defines 
 * 
 * @author Huaa
 * @date 2018-06-23 10:29
 * @version 1.0
 */
public class NormalCustomerStrategy implements Strategy {

	/* (non-Javadoc)
	 * @see com.huaa.strategy.Strategy#calcPrice(double)
	 */
	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("normal customer has not discount");
		return goodsPrice;
	}

}
