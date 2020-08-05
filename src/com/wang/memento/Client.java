package com.wang.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		Emp emp = new Emp("wang", 20, 5000);

		System.out.println("第一次创建对象" + emp.getEname() + emp.getAge() + emp.getSalsry());

		careTaker.setMemento(emp.memento());// 备忘录

		emp.setSalsry(8000);
		emp.setAge(21);

		System.out.println("第二次创建对象" + emp.getEname() + emp.getAge() + emp.getSalsry());

		emp.recovery(careTaker.getMemento());

		System.out.println("第三次创建对象" + emp.getEname() + emp.getAge() + emp.getSalsry());
	}
}
