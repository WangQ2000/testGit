package com.wang.prototype;

/**
 * ����ԭ��ģʽ������Ч��
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
		System.out.println("new�ķ�ʽ��������ʱ��"+(end-start));
	}
	
	public static void testClone() throws CloneNotSupportedException {
		long start = System.currentTimeMillis();
		Laptop laptop = new Laptop();
		Laptop laptop2 = null;
		for(int i=0;i<1000;i++) {
			laptop2 = (Laptop) laptop.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("clone�ķ�ʽ��������ʱ��"+(end-start));
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
		} // ģ�ⴴ������ĺ�ʱ����
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object object = super.clone();// ֱ�ӵ���object�����clone()����
		return object;
	}
}