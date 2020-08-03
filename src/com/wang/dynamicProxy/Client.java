package com.wang.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		Star realstar = new RealStar();
		StarHandler handler = new StarHandler(realstar);

		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] { Star.class },
				handler);
	
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();
		proxy.collectMoney();
	}
}
