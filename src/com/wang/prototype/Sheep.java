package com.wang.prototype;

import java.io.Serializable;
import java.sql.Date;

/**
 * 	原型模式
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
@SuppressWarnings("all")
public class Sheep implements Cloneable, Serializable {
	private String sname;
	private Date birthday;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object object = super.clone();// 直接调用object对象的clone()方法
		return object;
	}

	public Sheep(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}

	public Sheep() {
		super();
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
