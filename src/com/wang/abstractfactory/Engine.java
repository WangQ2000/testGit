package com.wang.abstractfactory;

public interface Engine {

	void run();

	void start();
}

class LuxuryEngine implements Engine {

	@Override
	public void run() {
		System.out.println("ת�Ŀ�");

	}

	@Override
	public void start() {
		System.out.println("�����죬�����Զ���ͣ");

	}

}

class LowerEngine implements Engine {

	@Override
	public void run() {
		System.out.println("ת����");

	}

	@Override
	public void start() {
		System.out.println("������");

	}

}
