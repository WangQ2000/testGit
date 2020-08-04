package com.wang.decorator;

public class Client {
	public static void main(String[] args) {
		ICar car = new Car();
		car.move();
		
		System.out.println("��������");
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();
		
		System.out.println("����ˮ��Ư");
		WaterCar waterCar = new WaterCar(flyCar);
		waterCar.move();
		
		System.out.println("��������");
		AICar aiCar = new AICar(waterCar);
		aiCar.move();
		
	}
}
