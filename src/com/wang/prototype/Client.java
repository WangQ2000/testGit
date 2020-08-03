package com.wang.prototype;

import java.sql.Date;

/**
 * 	����ԭ��ģʽ
 * 	ǳ����
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class Client {
	public static void main(String[] args) throws Exception {
		Date date = new Date(0);
		Sheep s1 = new Sheep("����",date);
		Sheep s2 = (Sheep) s1.clone();
		System.out.println(s1);
		System.out.println(s1.getBirthday());
		date.setTime(23452356237L);
		System.out.println(date);
		s1.setBirthday(date);
		
		System.out.println(s2);
		//��¡����ͬһ���������޸�ǰֵ��ͬ
		System.out.println(s1.getSname()+"-->"+s2.getSname());
		System.out.println(s1.getBirthday()+"-->"+s2.getBirthday());
		s2.setSname("����");
		System.out.println(s1.getSname()+"-->"+s2.getSname());
	}
}
