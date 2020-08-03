package com.wang.singleton;

/**
 * ����ģʽ��̬�ڲ���
 * 
 * @author wangQ
 *
 */
public class SingletonDemo04 {

	private static class SingletonClass {
		private static final SingletonDemo04 instance = new SingletonDemo04();
	}

	private SingletonDemo04() {

	}

	public static SingletonDemo04 getInstance() {
		return SingletonClass.instance;
	}
}
