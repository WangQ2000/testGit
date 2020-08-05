package com.wang.memento;

/**
 * 负责人 管理备忘录对象
 * 
 * @author wangQ
 *
 * @date 2020-8-5
 */
public class CareTaker {

	private EmpMemento memento;

	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}

}
