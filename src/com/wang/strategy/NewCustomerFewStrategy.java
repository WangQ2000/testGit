package com.wang.strategy;

public class NewCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(Double standardPrice) {
		System.out.println("�����ۣ�ԭ��");
		return standardPrice;
	}

}
