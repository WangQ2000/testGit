package com.wang.prototype;

/**
 * 测试原型模式的运行效率
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class Client04 {

	public static void testNew() {
		long start = System.currentTimeMillis();
		Laptop laptop = null;
		for(int i=0;i<1000;i++) {
			laptop = new Laptop();
		}
		long end = System.currentTimeMillis();
		System.out.println("new的方式创建，耗时："+(end-start));
	}
	
	public static void testClone() throws CloneNotSupportedException {
		long start = System.currentTimeMillis();
		Laptop laptop = new Laptop();
		Laptop laptop2 = null;
		for(int i=0;i<1000;i++) {
			laptop2 = (Laptop) laptop.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("clone的方式创建，耗时："+(end-start));
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		testNew();
		testClone();
	}
}

class Laptop implements Cloneable {
	public Laptop() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // 模拟创建对象的耗时过程
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object object = super.clone();// 直接调用object对象的clone()方法
		return object;
	}
}