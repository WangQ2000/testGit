package com.wang.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		Emp emp = new Emp("wang", 20, 5000);

		System.out.println("��һ�δ�������" + emp.getEname() + emp.getAge() + emp.getSalsry());

		careTaker.setMemento(emp.memento());// ����¼

		emp.setSalsry(8000);
		emp.setAge(21);

		System.out.println("�ڶ��δ�������" + emp.getEname() + emp.getAge() + emp.getSalsry());

		emp.recovery(careTaker.getMemento());

		System.out.println("�����δ�������" + emp.getEname() + emp.getAge() + emp.getSalsry());
	}
}
