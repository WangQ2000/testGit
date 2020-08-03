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
public class StarHandler implements InvocationHandler {

	private Star realstar;

	public StarHandler(Star realstar) {
		this.realstar = realstar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("真正的方法执行前");
		Object object = null;
		if (method.getName().equals("sing")) {
			object = method.invoke(realstar, args);
		}
		System.out.println("真正的方法执行后");
		return object;
	}

}
