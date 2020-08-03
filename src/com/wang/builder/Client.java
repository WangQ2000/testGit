package com.wang.builder;

public class Client {
	public static void main(String[] args) {

		AirshipDirector airshipDirector = new WangAirshipDirector(new WangAirshipBuilder());

		Airship airship = airshipDirector.directAirship();
		System.out.println(airship.hashCode());
		System.out.println(airship.getEngine().getName());
		airship.launch();
	}
}
