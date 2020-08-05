package com.wang.odserver2;

public class Client {
	public static void main(String[] args) {
		ConcreteSubject cSubject = new ConcreteSubject();

		// 创建多个观察者
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		cSubject.addObserver(obs1);
		cSubject.addObserver(obs2);
		cSubject.addObserver(obs3);
		
		cSubject.setState(3000);
		
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}
}
