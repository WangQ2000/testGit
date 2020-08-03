package com.wang.adstractfactory;

public class Client {
	public static void main(String[] args) {
		CarFactory factory = new LuxuryCarFactory();
		Engine engine = factory.createEngine();
		engine.run();
		engine.start();
	}
}
