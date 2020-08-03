package com.wang.prototype;

import java.sql.Date;

/**
 * 	测试原型模式
 * 	深复制
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class Client02 {
	public static void main(String[] args) throws Exception {
		Date date = new Date(0);
		Sheep02 s1 = new Sheep02("多莉",date);
		System.out.println(s1);
		System.out.println(s1.getBirthday());
		Sheep02 s2 = (Sheep02) s1.clone();
		
		
		date.setTime(23452356237L);
		System.out.println(date);
		s1.setBirthday(date);
		
		System.out.println(s2);
		//克隆后不是同一个对象但是修改前值相同
		System.out.println(s1.getSname()+"-->"+s2.getSname());
		System.out.println(s1.getBirthday()+"-->"+s2.getBirthday());
		s2.setSname("少莉");
		System.out.println(s1.getSname()+"-->"+s2.getSname());
	}
}
