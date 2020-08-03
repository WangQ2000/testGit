package com.wang.singleton;

public class Client {

	public static void main(String[] args) {
		//饿汉式
		SingletonDemo01 s1 = SingletonDemo01.getInstance();
		SingletonDemo01 s2 = SingletonDemo01.getInstance();
		System.out.println(s1.hashCode()+"-->"+s2.hashCode());
		//懒汉式
		SingletonDemo02 s3 = SingletonDemo02.getInstance();
		SingletonDemo02 s4 = SingletonDemo02.getInstance();
		System.out.println(s3.hashCode()+"-->"+s4.hashCode());
		//双重检测
		SingletonDemo03 s9 = SingletonDemo03.getInstance();
		SingletonDemo03 s10 = SingletonDemo03.getInstance();
		System.out.println(s9.hashCode()+"-->"+s10.hashCode());
		//静态内部类
		SingletonDemo04 s5 = SingletonDemo04.getInstance();
		SingletonDemo04 s6 = SingletonDemo04.getInstance();
		System.out.println(s5.hashCode()+"-->"+s6.hashCode());
		//枚举实现
		SingletonDemo05 s7 = SingletonDemo05.INSTANCE;
		SingletonDemo05 s8 = SingletonDemo05.INSTANCE;
		System.out.println(s7.hashCode()+"-->"+s8.hashCode());
	}
}
