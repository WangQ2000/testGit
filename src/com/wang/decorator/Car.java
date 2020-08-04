package com.wang.decorator;

/**
 * 	具体对象
 * 
 * @author wangQ
 *
 * @date 2020-8-4
 */
public class Car implements ICar {

	@Override
	public void move() {
		System.out.println("陆地上跑");

	}

}
