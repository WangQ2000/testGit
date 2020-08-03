package com.wang.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ����ģʽ����ʽ ��ֹ����ͷ����л�©��
 * 
 * @author wangQ
 *
 */
@SuppressWarnings("serial")
public class SingletonDemo06 implements Serializable {

	private static SingletonDemo06 instance = new SingletonDemo06();// ���ʼ��ʱ����������Class����

	private SingletonDemo06() {
		if (instance != null) {
			throw new RuntimeException();
		}
	}

	public static synchronized SingletonDemo06 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo06();
		}
		return instance;
	}
	// �����л�ʱ����Ѿ����ڸ���Ķ����ֱ�ӵ��ô˷�����ԭ�ж��󷵻�,����������new����
	private Object readResolve() {
		return instance;

	}

}
