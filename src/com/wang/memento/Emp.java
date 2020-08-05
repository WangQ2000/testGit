package com.wang.memento;

/**
 * Դ������
 * 
 * @author wangQ
 *
 * @date 2020-8-5
 */
public class Emp {
	private String ename;
	private int age;
	private double salsry;

	// ����¼����
	public EmpMemento memento() {
		return new EmpMemento(this);
	}

	// �ظ�ԭ�б���¼��ֵ
	public void recovery(EmpMemento mmt) {
		this.age = mmt.getAge();
		this.ename = mmt.getEname();
		this.salsry = mmt.getSalsry();
	}

	public Emp(String ename, int age, double salsry) {
		super();
		this.ename = ename;
		this.age = age;
		this.salsry = salsry;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalsry() {
		return salsry;
	}

	public void setSalsry(double salsry) {
		this.salsry = salsry;
	}

}
