package com.huaa.action.strategy;

/**
 * This class defines
 * 
 * @author Huaa
 * @date 2018-06-23 10:33
 * @version 1.0
 */
public class Price {
	private Strategy strategy;

	public Price(Strategy strategy) {
		this.strategy = strategy;
	}

	public double quote(double goodsPrice) {
		return this.strategy.calcPrice(goodsPrice);
	}

}
