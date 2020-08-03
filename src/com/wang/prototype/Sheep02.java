package com.wang.prototype;

import java.sql.Date;

/**
 * ԭ��ģʽ
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public class Sheep02 implements Cloneable {
	private String sname;
	private Date birthday;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object object = super.clone();// ֱ�ӵ���object�����clone()����
		
		//��Ӵ���ʵ�����
		Sheep02 sheep02 = (Sheep02) object;
		//�����Զ���Ҳ���и���
		sheep02.birthday = (Date) this.birthday.clone();
		return object;
	}

	public Sheep02(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}

	public Sheep02() {
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
