package com.wang.state;

public class Context {

	private State state;
	
	public void setState(State state) {
		System.out.println("�޸�״̬");
		this.state = state;
		this.state.handle();
	}
}
