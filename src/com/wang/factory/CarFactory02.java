package com.wang.factory;

/**
 * �򵥹���ģʽ
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class CarFactory02 {

	public static Car createAudiCar() {
		return new Audi();
	}

	public static Car createBydCar() {
		return new Byd();
	}
}
