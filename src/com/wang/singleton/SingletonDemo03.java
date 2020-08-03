package com.wang.singleton;

/**
 * 单例模式双重检测
 * 
 * @author wangQ
 *
 */
public class SingletonDemo03 {

	private static SingletonDemo03 instance;// 延迟加载

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
