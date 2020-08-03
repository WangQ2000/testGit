package com.wang.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 单例模式饿汉式 防止反射和反序列化漏洞
 * 
 * @author wangQ
 *
 */
@SuppressWarnings("serial")
public class SingletonDemo06 implements Serializable {

	private static SingletonDemo06 instance = new SingletonDemo06();// 类初始化时，立即加载Class对象

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
	// 反序列化时如果已经存在该类的对象就直接调用此方法将原有对象返回,而不再重新new对象
	private Object readResolve() {
		return instance;

	}

}
