package com.wang.strategy;

public class OldCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(Double standardPrice) {
		System.out.println("�������");
		return standardPrice*0.85;
	}

}
