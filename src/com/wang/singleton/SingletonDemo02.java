package com.wang.singleton;

/**
 * ����ģʽ����ʽ
 * 
 * @author wangQ
 *
 */
public class SingletonDemo02 {

	private static SingletonDemo02 instance;//�ӳټ���

	private SingletonDemo02() {
	}

	public static synchronized SingletonDemo02 getInstance() {
		if(instance == null) {
			instance =  new SingletonDemo02();
		}
		return instance;
	}

}
