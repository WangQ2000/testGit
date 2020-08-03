package com.wang.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;

/**
 * 	ʹ�����л��ͷ����л�ʵ�����
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class Client03 {

	public static void main(String[] args) throws Exception {
		Date date = new Date(0);
		Sheep s1 = new Sheep("����", date);
		System.out.println(s1.getBirthday());
		//���л�
		ByteArrayOutputStream boStream = new ByteArrayOutputStream();
		ObjectOutputStream ooStream = new ObjectOutputStream(boStream);

		ooStream.writeObject(s1);
		byte[] datas = boStream.toByteArray();

		//�����л�
		ByteArrayInputStream biStream = new ByteArrayInputStream(datas);
		ObjectInputStream oiStream = new ObjectInputStream(biStream);

		Sheep s2 = (Sheep) oiStream.readObject();// �¿�¡�õĶ���

		date.setTime(23452356237L);
		System.out.println(date);
		s1.setBirthday(date);

		// ��¡����ͬһ���������޸�ǰֵ��ͬ
		System.out.println(s1.getBirthday() + "-->" + s2.getBirthday());
		s2.setSname("����");
		System.out.println(s1.getSname() + "-->" + s2.getSname());
	}
}
