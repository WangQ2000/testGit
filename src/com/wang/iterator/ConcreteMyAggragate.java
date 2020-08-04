package com.wang.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚合类
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
	//获取迭代器
	public MyIterator createIterator() {
		return new ConcreteIterator();
	}
	
	
	//通过内部类定义迭代器，可以直接使用外部类的属性
	private class ConcreteIterator implements MyIterator {

		private int cursor;//用于记录遍历时的位置
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
