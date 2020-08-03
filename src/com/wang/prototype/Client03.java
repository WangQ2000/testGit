package com.wang.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;

/**
 * 	使用序列化和反序列化实现深复制
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class Client03 {

	public static void main(String[] args) throws Exception {
		Date date = new Date(0);
		Sheep s1 = new Sheep("多莉", date);
		System.out.println(s1.getBirthday());
		//序列化
		ByteArrayOutputStream boStream = new ByteArrayOutputStream();
		ObjectOutputStream ooStream = new ObjectOutputStream(boStream);

		ooStream.writeObject(s1);
		byte[] datas = boStream.toByteArray();

		//反序列化
		ByteArrayInputStream biStream = new ByteArrayInputStream(datas);
		ObjectInputStream oiStream = new ObjectInputStream(biStream);

		Sheep s2 = (Sheep) oiStream.readObject();// 新克隆好的对象

		date.setTime(23452356237L);
		System.out.println(date);
		s1.setBirthday(date);

		// 克隆后不是同一个对象但是修改前值相同
		System.out.println(s1.getBirthday() + "-->" + s2.getBirthday());
		s2.setSname("少莉");
		System.out.println(s1.getSname() + "-->" + s2.getSname());
	}
}
