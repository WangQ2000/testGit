package com.wang.singleton;

/**
 * 单例模式懒汉式
 * 
 * @author wangQ
 *
 */
public class SingletonDemo02 {

	private static SingletonDemo02 instance;//延迟加载

	private SingletonDemo02() {
	}

	public static synchronized SingletonDemo02 getInstance() {
		if(instance == null) {
			instance =  new SingletonDemo02();
		}
		return instance;
	}

}
