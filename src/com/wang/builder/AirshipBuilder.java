package com.wang.builder;

public interface AirshipBuilder {

	Engine createEngine();
	OrbitalModule createOrbitalModule();
	EscapeTower createEscapeTower();
}
