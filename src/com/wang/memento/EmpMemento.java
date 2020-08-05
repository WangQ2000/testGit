package com.wang.memento;

public class EmpMemento {
	private String ename;
	private int age;
	private double salsry;

	public EmpMemento(Emp e) {
		super();
		this.ename = e.getEname();
		this.age = e.getAge();
		this.salsry = e.getSalsry();
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
