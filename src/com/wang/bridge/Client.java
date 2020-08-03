package com.wang.bridge;

public class Client {
	public static void main(String[] args) {
		//销售联想笔记本
		ComputerT computerT = new Laptop2(new Lenovo());
		computerT.sale();
		computerT = new Desktop2(new Dell());
		computerT.sale();
	}
}
