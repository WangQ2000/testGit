package com.wang.abstractfactory;

public interface Seat {

	void message();
}

class LuxurySeat implements Seat {

	@Override
	public void message() {

		System.out.println("�����Զ���Ħ");
	}

}

class LowerSeat implements Seat {

	@Override
	public void message() {

		System.out.println("�����԰�Ħ");
	}

}
