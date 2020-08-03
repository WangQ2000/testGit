package com.wang.bridge;

/**
 * 	未使用桥接模式
 * 
 * @author wangQ
 *
 * @date 2020-8-3
 */
public interface Computer {
	void sale();
}

class Desktop implements Computer {
	@Override
	public void sale() {
		System.out.println("销售台式机");
	}

}

class Laptop implements Computer {
	@Override
	public void sale() {
		System.out.println("销售笔记本");
	}

}

class Pead implements Computer {
	@Override
	public void sale() {
		System.out.println("销售平板");
	}
}

class LenovoDestop extends Desktop {

	@Override
	public void sale() {
		System.out.println("销售联想台式机");
	}
}

class LenovoLeptop extends Laptop {

	@Override
	public void sale() {
		System.out.println("销售联想笔记本");
	}
}

class LenovoPead extends Pead {

	@Override
	public void sale() {
		System.out.println("销售联想平板");
	}
}

class DellDestop extends Desktop {

	@Override
	public void sale() {
		System.out.println("销售戴尔台式机");
	}
}

class DellLeptop extends Laptop {

	@Override
	public void sale() {
		System.out.println("销售戴尔笔记本");
	}
}

class DellPead extends Pead {

	@Override
	public void sale() {
		System.out.println("销售戴尔平板");
	}
}

class ShenzhouDestop extends Desktop {

	@Override
	public void sale() {
		System.out.println("销售神州台式机");
	}
}

class ShenzhouLeptop extends Laptop {

	@Override
	public void sale() {
		System.out.println("销售神州笔记本");
	}
}

class ShenzhouPead extends Pead {

	@Override
	public void sale() {
		System.out.println("销售神州平板");
	}
}