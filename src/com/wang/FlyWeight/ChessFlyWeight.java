package com.wang.FlyWeight;

public interface ChessFlyWeight {
	void setColor(String color);

	String getColor();

	void display(Coordinate c);
}
