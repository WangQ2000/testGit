package com.wang.adstractfactory;

public interface Tyre {

	void revolve();
}

class LuxuryTyre implements Tyre {

	@Override
	public void revolve() {

		System.out.println("��ת��ĥ��");
	}

}

class LowerTyre implements Tyre {

	@Override
	public void revolve() {

		System.out.println("ĥ���");
	}

}
