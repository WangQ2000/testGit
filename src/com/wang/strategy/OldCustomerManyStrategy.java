package com.wang.strategy;

public class OldCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(Double standardPrice) {
		System.out.println("�����");
		return standardPrice*0.8;
	}

}
