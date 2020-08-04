package com.wang.strategy;

public class NewCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(Double standardPrice) {
		System.out.println("´ò¾ÅÕÛ");
		return standardPrice*0.9;
	}

}
