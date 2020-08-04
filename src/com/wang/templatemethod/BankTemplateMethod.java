package com.wang.templatemethod;

public abstract class BankTemplateMethod {
	private void takeNumber() {
		System.out.println("ȡ���Ŷ�");
	}

	protected abstract void transact();// ��������ҵ��

	public void evaluate() {
		System.out.println("��������");
	}

	public  final void process() {//ģ�巽��
		this.takeNumber();

		this.transact();

		this.evaluate();
	}
}
