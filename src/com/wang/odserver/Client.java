package com.wang.odserver;

public class Client {
	public static void main(String[] args) {
		ConcreteSubject cSubject = new ConcreteSubject();

		// 创建多个观察者
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		cSubject.registerObserver(obs1);
		cSubject.registerObserver(obs2);
		cSubject.registerObserver(obs3);
		
		cSubject.setState(3000);
		
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}
}
