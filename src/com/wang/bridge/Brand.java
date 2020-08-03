package com.wang.bridge;

/**
 * 	品牌
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
		System.out.print("销售联想");
	}
}

class Dell implements Brand {

	@Override
	public void sale() {
		System.out.print("销售戴尔");
	}
}