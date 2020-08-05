package com.wang.odserver2;

import java.util.Observable;

public class ConcreteSubject extends Observable {

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		//Ŀ�����ֵ�����˱仯��֪ͨ���й۲���
		setChanged();
		notifyObservers(this.state);
	}
	
	
}
