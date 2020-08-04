package com.wang.iterator;

public class Client {
	public static void main(String[] args) {
		ConcreteMyAggragate cMyAggragate = new ConcreteMyAggragate();
		cMyAggragate.addObject("aa");
		cMyAggragate.addObject("bb");
		cMyAggragate.addObject("cc");
		
		MyIterator iterator = cMyAggragate.createIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.getCurrentObj());
			iterator.next();
		}
	}
}
