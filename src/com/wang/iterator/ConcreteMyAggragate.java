package com.wang.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * �Զ���ۺ���
 * 
 * @author wangQ
 *
 * @date 2020-8-4
 */
public class ConcreteMyAggragate {
	private List<Object> list = new ArrayList<>();

	public ConcreteMyAggragate() {
		super();
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public void addObject(Object object) {
		this.list.add(object);
	}

	public void removeObject(Object object) {
		this.list.remove(object);
	}
	//��ȡ������
	public MyIterator createIterator() {
		return new ConcreteIterator();
	}
	
	
	//ͨ���ڲ��ඨ�������������ֱ��ʹ���ⲿ�������
	private class ConcreteIterator implements MyIterator {

		private int cursor;//���ڼ�¼����ʱ��λ��
		@Override
		public void first() {
			// TODO Auto-generated method stub
			cursor = 0;
		}

		@Override
		public void next() {
			if(cursor<list.size()) {
				cursor ++;
			}

		}

		@Override
		public boolean hasNext() {
			return cursor<list.size()?true:false;
		}

		@Override
		public boolean isFirst() {
			// TODO Auto-generated method stub
			return cursor == 0?true:false;
		}

		@Override
		public Object getCurrentObj() {
			// TODO Auto-generated method stub
			return list.get(cursor);
		}

	}
}
