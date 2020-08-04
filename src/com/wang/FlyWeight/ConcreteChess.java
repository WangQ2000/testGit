package com.wang.FlyWeight;

public class ConcreteChess implements ChessFlyWeight {

	private String color;

	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;

	}

	@Override
	public String getColor() {
	
		return color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println(color);
		System.out.println(c.getX()+"------"+c.getY());
	}

}
