package com.wang.singleton;

/**
 * ����ģʽ˫�ؼ��
 * 
 * @author wangQ
 *
 */
public class SingletonDemo03 {

	private static SingletonDemo03 instance;// �ӳټ���

	private SingletonDemo03() {
	}

	public static synchronized SingletonDemo03 getInstance() {
		if (instance == null) {
			SingletonDemo03 sc;
			synchronized (SingletonDemo03.class) {
				sc = instance;
				synchronized (SingletonDemo03.class) {
					if (sc == null) {
						sc = new SingletonDemo03();
					}
				}
				instance = sc;
			}
		}
		return instance;
	}

}
