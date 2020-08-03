package com.wang.adstractfactory;

public interface CarFactory {

	Engine createEngine();

	Seat createSeat();

	Tyre createTyre();
}
