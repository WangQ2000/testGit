package com.wang.adapter;

/**
 * 	������
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class Adapter extends Adaptee implements Target {

	
	@Override
	public void handleReq() {

		super.request();
	}

}
