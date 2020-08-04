package com.wang.templatemethod;

public abstract class BankTemplateMethod {
	private void takeNumber() {
		System.out.println("取号排队");
	}

	protected abstract void transact();// 办理具体的业务

	public void evaluate() {
		System.out.println("反馈评分");
	}

	public  final void process() {//模板方法
		this.takeNumber();

		this.transact();

		this.evaluate();
	}
}
