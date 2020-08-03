package com.wang.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬����
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

		System.out.println("�����ķ���ִ��ǰ");
		Object object = null;
		if (method.getName().equals("sing")) {
			object = method.invoke(realstar, args);
		}
		System.out.println("�����ķ���ִ�к�");
		return object;
	}

}
