package com.wang.builder;

public class WangAirshipBuilder implements AirshipBuilder {

	@Override
	public Engine createEngine() {
		System.out.println("����������");
		return new Engine("wang");
	}

	@Override
	public OrbitalModule createOrbitalModule() {
		System.out.println("�����");
		return new OrbitalModule("wang");
	}

	@Override
	public EscapeTower createEscapeTower() {
		System.out.println("����������");
		return new EscapeTower("wang");
	}

}
