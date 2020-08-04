package com.wang.mediator;

public class Market implements Department {

	private Mediator m;

	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("接项目");

	}

	@Override
	public void outAction() {
		System.out.println("汇报工作，需要资金支持");
		m.command("finacial");

	}

}
