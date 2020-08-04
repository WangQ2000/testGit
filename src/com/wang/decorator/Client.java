package com.wang.decorator;

public class Client {
	public static void main(String[] args) {
		ICar car = new Car();
		car.move();
		
		System.out.println("新增飞行");
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();
		
		System.out.println("新增水上漂");
		WaterCar waterCar = new WaterCar(flyCar);
		waterCar.move();
		
		System.out.println("新增智能");
		AICar aiCar = new AICar(waterCar);
		aiCar.move();
		
	}
}
