package com.wang.singleton;

/**
 * ����ģʽ����ʽ
 * 
 * @author wangQ
 *
 */
public class SingletonDemo01 {

	private static SingletonDemo01 instance = new SingletonDemo01();// ���ʼ��ʱ����������Class����

	private SingletonDemo01() {
	}

	public static SingletonDemo01 getInstance() {
		return instance;
	}

}
