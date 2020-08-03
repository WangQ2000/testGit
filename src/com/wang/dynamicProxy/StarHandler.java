package com.wang.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class StarHandler implements InvocationHandler, Star {

	private Star realstar;

	public StarHandler(Star realstar) {
		this.realstar = realstar;
	}

	public StarHandler() {
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		// System.out.println("真正的方法执行前");
		Object object = null;
		if (method.getName().equals("sing")) {
			object = method.invoke(realstar, args);
		} else {
			object = method.invoke(new StarHandler(), args);
		}
		// System.out.println("真正的方法执行后");
		return object;
	}

	@Override
	public void confer() {
		System.out.println("StarHandler.confer");

	}

	@Override
	public void signContract() {
		System.out.println("StarHandler.signContract");

	}

	@Override
	public void bookTicket() {
		System.out.println("StarHandler.bookTicket");

	}

	@Override
	public void sing() {
		System.out.println("StarHandler.sing");

	}

	@Override
	public void collectMoney() {
		System.out.println("StarHandler.collectMoney");

	}

}
