package com.wang.factory;

/**
 *	û�й���ģʽ�������
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class Client01 {

	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new Byd();

		c1.run();
		c2.run();

	}
}
