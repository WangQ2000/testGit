package com.wang.adapter;

/**
 * ÊÊÅäÆ÷
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class Adapter2 implements Target {

	private Adaptee adaptee = null;
	
	public Adapter2() {

	}
	
	public Adapter2(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void handleReq() {

		adaptee.request();
	}

}
