package com.wang.strategy;

public class Client {
	public static void main(String[] args) {
		Strategy strategy1 = new NewCustomerManyStrategy();
		Context context = new Context(strategy1);
		context.printPrice(8200);
	}
}
