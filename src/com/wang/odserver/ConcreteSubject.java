package com.wang.odserver;

public class ConcreteSubject extends Subject {

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		//目标对象值反正了变化请通知所有观察者
		this.notifyAllObserver();
	}
	
	
}
