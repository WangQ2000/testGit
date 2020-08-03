package com.wang.abstractfactory;

public interface Seat {

	void message();
}

class LuxurySeat implements Seat {

	@Override
	public void message() {

		System.out.println("可以自动按摩");
	}

}

class LowerSeat implements Seat {

	@Override
	public void message() {

		System.out.println("不可以按摩");
	}

}
