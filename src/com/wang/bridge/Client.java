package com.wang.bridge;

public class Client {
	public static void main(String[] args) {
		//��������ʼǱ�
		ComputerT computerT = new Laptop2(new Lenovo());
		computerT.sale();
		computerT = new Desktop2(new Dell());
		computerT.sale();
	}
}
