package com.wang.adapter;

/**
 *	 客户端（笔记本只有usb接口）
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class Client {
	
	public void test1(Target t) {
		t.handleReq();
	}

	public static void main(String[] args) {
		Client client = new Client();
		Adaptee adaptee = new Adaptee();
		
		Target target = new Adapter();
		client.test1(target);
		
		target = new Adapter2(adaptee);
		client.test1(target);
	}
}
