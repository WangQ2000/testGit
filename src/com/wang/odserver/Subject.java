package com.wang.odserver;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> list = new ArrayList<>();
	
	public void registerObserver(Observer observer) {
		list.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		list.remove(observer);
	}
	
	//֪ͨ���й۲��߸���״̬
	public void notifyAllObserver() {
		for(Observer obj:list) {
			obj.update(this);
		}
	}
}
