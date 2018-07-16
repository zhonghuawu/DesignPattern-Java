package com.huaa.action.strategy;
/**
 * This class defines 
 * 
 * @author Huaa
 * @date 2018-06-23 10:34
 * @version 1.0
 */
public class PriceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double goodsPrice = 1000;
//		Strategy strategy = new NormalCustomerStrategy();
		Strategy strategy = new RegularCustomers();
		Price price = new Price(strategy);
		double quote = price.quote(goodsPrice);
		System.out.println(quote);
	}

}
