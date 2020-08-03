package com.wang.builder;

public class WangAirshipDirector implements AirshipDirector {

	AirshipBuilder builder;

	public WangAirshipDirector(AirshipBuilder builder) {
		super();
		this.builder = builder;
	}

	@Override
	public Airship directAirship() {
		Engine engine = builder.createEngine();
		OrbitalModule orbitalModule = builder.createOrbitalModule();
		EscapeTower escapeTower = builder.createEscapeTower();

		Airship airship = new Airship();
		airship.setEngine(engine);
		airship.setOrbitalModule(orbitalModule);
		airship.setEscapeTower(escapeTower);
		return airship;
	}

}
