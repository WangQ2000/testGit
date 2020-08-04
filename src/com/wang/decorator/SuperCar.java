package com.wang.decorator;

/**
 * װ����
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
 * ����װ�ζ���
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
		System.out.println("+���Ϸ�");
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
		System.out.println("+ˮ��Ư");
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
		System.out.println("+�Զ�");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		autoMove();
	}

}
