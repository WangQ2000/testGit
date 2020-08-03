package com.wang.staticproxy;

/**
 * 代理类（经纪人）
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class ProxyStar implements Star {

	private Star realstar;

	public ProxyStar(Star realstar) {
		this.realstar = realstar;
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar.confer");

	}

	@Override
	public void signContract() {
		System.out.println("ProxyStar.signContract");

	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket");

	}

	@Override
	public void sing() {
		realstar.sing();

	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney");

	}

}
