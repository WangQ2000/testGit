package com.wang.factory;

/**
 *	简单工厂模式的情况下
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class Client02 {

	public static void main(String[] args) {
//		Car c1 = CarFactory.createCar("audi");
//		Car c2 = CarFactory.createCar("byd");

		Car c1 = CarFactory02.createAudiCar();
		Car c2 = CarFactory02.createBydCar();

		c1.run();
		c2.run();

	}
}
