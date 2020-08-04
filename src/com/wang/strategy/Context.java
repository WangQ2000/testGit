package com.wang.strategy;

/**
 * 使得算法独立于用户端
 * 
 * @author wangQ
 *
 * @date 2020-8-4
 */
public class Context {
	private Strategy strategy;// 当前才采用的算法对象

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void printPrice(double d) {
		System.out.println("您该报价："+strategy.getPrice(d));
	}
}
