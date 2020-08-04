package com.wang.composite;

/**
 * 	�������
 * 
 * @author wangQ
 *
 * @date 2020-8-4
 */
public interface Component {
	void operation();
}

//Ҷ�����
interface Leaf extends Component {

}

//�������
interface Composite extends Component {
	void add(Component c);

	void remove(Component c);

	Component getChild(int index);
}