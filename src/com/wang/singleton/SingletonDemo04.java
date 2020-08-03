package com.wang.singleton;

/**
 * 单例模式静态内部类
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
