package com.wang.iterator;

/**
 * 	�������ӿ�
 * 
 * @author wangQ
 *
 * @date 2020-8-4
 */
public interface MyIterator {
	void first();// ���α�ָ���һ��

	void next();// ���α�ָ����һ��

	boolean hasNext();// �Ƿ�����һ��

	boolean isFirst();

	Object getCurrentObj();// ��ȡ��ǰ�α�ָ��Ķ���
}
