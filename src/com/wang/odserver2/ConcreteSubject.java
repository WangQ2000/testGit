package com.wang.odserver2;

import java.util.Observable;

public class ConcreteSubject extends Observable {

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		//目标对象值反正了变化请通知所有观察者
		setChanged();
		notifyObservers(this.state);
	}
	
	
}
