package com.wang.builder;

public class WangAirshipBuilder implements AirshipBuilder {

	@Override
	public Engine createEngine() {
		System.out.println("构建发动机");
		return new Engine("wang");
	}

	@Override
	public OrbitalModule createOrbitalModule() {
		System.out.println("轨道舱");
		return new OrbitalModule("wang");
	}

	@Override
	public EscapeTower createEscapeTower() {
		System.out.println("构建逃逸塔");
		return new EscapeTower("wang");
	}

}
