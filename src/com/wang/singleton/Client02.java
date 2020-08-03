package com.wang.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * ���Է���ͷ����л��ƽⵥ��ģʽ
 * 
 * @author wangQ
 *
 */
public class Client02 {

	public static void main(String[] args) throws Exception {
		// ����ʽ
		SingletonDemo06 s1 = SingletonDemo06.getInstance();
		SingletonDemo06 s2 = SingletonDemo06.getInstance();
		System.out.println(s1.hashCode() + "-->" + s2.hashCode());

		// ͨ�����䷽ʽ�ƽⵥ��ģʽ

		// Class<SingletonDemo06> clz = (Class<SingletonDemo06>)
		// Class.forName("com.wang.singleton.SingletonDemo06");
		// Constructor<SingletonDemo06> c1 = clz.getDeclaredConstructor(null);
		// c1.setAccessible(true);// �رհ�ȫ���
		// SingletonDemo06 s3 = c1.newInstance();
		// SingletonDemo06 s4 = c1.newInstance();
		// System.out.println(s3.hashCode() + "-->" + s4.hashCode());

		// ͨ�����л��ͷ����л��ƽⵥ��ģʽ
		// ���л�
		// FileOutputStream fos = new FileOutputStream("e:/myjava/a.txt");
		// ObjectOutputStream oos = new ObjectOutputStream(fos);
		// oos.writeObject(s1);
		// oos.close();
		// fos.close();
		// // �����л�
		// ObjectInputStream ois = new ObjectInputStream(new
		// FileInputStream("e:/myjava/a.txt"));
		// SingletonDemo06 s3 = (SingletonDemo06) ois.readObject();
		// System.out.println(s1.hashCode() + "-->" + s3.hashCode());

	}
}
