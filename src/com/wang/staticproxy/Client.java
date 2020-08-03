package com.wang.staticproxy;

public class Client {

	public static void main(String[] args) {
		Star star = new RealStar();
		Star proxyStar = new ProxyStar(star);
		
		proxyStar.confer();
		proxyStar.signContract();
		proxyStar.bookTicket();
		proxyStar.sing();
		
		proxyStar.collectMoney();
	}
}
