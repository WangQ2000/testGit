package com.wang.singleton;

/**
 * 单例模式饿汉式
 * 
 * @author wangQ
 *
 */
public class SingletonDemo01 {

	private static SingletonDemo01 instance = new SingletonDemo01();// 类初始化时，立即加载Class对象

	private SingletonDemo01() {
	}

	public static SingletonDemo01 getInstance() {
		return instance;
	}

}
