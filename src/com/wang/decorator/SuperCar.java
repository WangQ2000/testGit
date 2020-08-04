package com.wang.decorator;

/**
 * 装饰器
 * 
 * @author wangQ
 *
 * @date 2020-8-4
 */
public class SuperCar implements ICar {

	private ICar car;

	public SuperCar(ICar car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
	}

}

/**
 * 具体装饰对象
 * 
 * @author wangQ
 *
 * @date 2020-8-4
 */
class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
	}

	private void fly() {
		System.out.println("+天上飞");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();
	}

}

class WaterCar extends SuperCar {

	public WaterCar(ICar car) {
		super(car);
	}

	private void swim() {
		System.out.println("+水上漂");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		swim();
	}

}

class AICar extends SuperCar {

	public AICar(ICar car) {
		super(car);
	}

	private void autoMove() {
		System.out.println("+自动");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		autoMove();
	}

}
