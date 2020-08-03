package com.wang.bridge;

/**
 * 	Ʒ��
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public interface Brand {
	void sale();
}

class Lenovo implements Brand {

	@Override
	public void sale() {
		System.out.print("��������");
	}
}

class Dell implements Brand {

	@Override
	public void sale() {
		System.out.print("���۴���");
	}
}