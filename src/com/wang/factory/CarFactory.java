package com.wang.factory;

/**
 * 简单工厂模式
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class CarFactory {

	public static Car createCar(String type) {
		if ("audi".equals(type)) {
			return new Audi();
		} else if ("byd".equals(type)) {
			return new Byd();
		} else {
			return null;
		}
	}

}
