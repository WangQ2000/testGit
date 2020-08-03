package com.wang.bridge;

/**
 * ����
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public abstract class ComputerT {

	protected Brand brand;

	public ComputerT(Brand b) {
		this.brand = b;
	}

	public void sale() {
		brand.sale();
	}
}

class Desktop2 extends ComputerT {
	public Desktop2(Brand b) {
		super(b);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("̨ʽ��");
	}
}

class Laptop2 extends ComputerT {
	public Laptop2(Brand b) {
		super(b);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("�ʼǱ�");
	}
}