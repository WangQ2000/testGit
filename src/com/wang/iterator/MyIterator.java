package com.wang.iterator;

/**
 * 	迭代器接口
 * 
 * @author wangQ
 *
 * @date 2020-8-4
 */
public interface MyIterator {
	void first();// 将游标指向第一个

	void next();// 将游标指向下一个

	boolean hasNext();// 是否还有下一个

	boolean isFirst();

	Object getCurrentObj();// 获取当前游标指向的对象
}
