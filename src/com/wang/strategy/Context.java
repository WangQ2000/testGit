package com.wang.strategy;

/**
 * ʹ���㷨�������û���
 * 
 * @author wangQ
 *
 * @date 2020-8-4
 */
public class Context {
	private Strategy strategy;// ��ǰ�Ų��õ��㷨����

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void printPrice(double d) {
		System.out.println("���ñ��ۣ�"+strategy.getPrice(d));
	}
}
