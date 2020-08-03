package com.wang.adstractfactory;

public interface Tyre {

	void revolve();
}

class LuxuryTyre implements Tyre {

	@Override
	public void revolve() {

		System.out.println("Ðý×ª²»Ä¥Ëð");
	}

}

class LowerTyre implements Tyre {

	@Override
	public void revolve() {

		System.out.println("Ä¥Ëð¿ì");
	}

}
