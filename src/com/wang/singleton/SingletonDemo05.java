package com.wang.singleton;

/**
 * 单例模式枚举实现
 * 
 * @author wangQ
 *
 */
public enum SingletonDemo05 {
	//枚举本身就是单例模式
	INSTANCE;
	
	//添加需要的方法
	public void singletonOperation() {
		
	}
}

//可以通过SingletonDemo05.INSTANCE获取