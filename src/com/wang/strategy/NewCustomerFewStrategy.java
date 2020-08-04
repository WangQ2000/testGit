package com.wang.strategy;

public class NewCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(Double standardPrice) {
		System.out.println("不打折，原价");
		return standardPrice;
	}

}
