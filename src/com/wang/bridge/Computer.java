package com.wang.bridge;

/**
 * 	δʹ���Ž�ģʽ
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
		System.out.println("����̨ʽ��");
	}

}

class Laptop implements Computer {
	@Override
	public void sale() {
		System.out.println("���۱ʼǱ�");
	}

}

class Pead implements Computer {
	@Override
	public void sale() {
		System.out.println("����ƽ��");
	}
}

class LenovoDestop extends Desktop {

	@Override
	public void sale() {
		System.out.println("��������̨ʽ��");
	}
}

class LenovoLeptop extends Laptop {

	@Override
	public void sale() {
		System.out.println("��������ʼǱ�");
	}
}

class LenovoPead extends Pead {

	@Override
	public void sale() {
		System.out.println("��������ƽ��");
	}
}

class DellDestop extends Desktop {

	@Override
	public void sale() {
		System.out.println("���۴���̨ʽ��");
	}
}

class DellLeptop extends Laptop {

	@Override
	public void sale() {
		System.out.println("���۴����ʼǱ�");
	}
}

class DellPead extends Pead {

	@Override
	public void sale() {
		System.out.println("���۴���ƽ��");
	}
}

class ShenzhouDestop extends Desktop {

	@Override
	public void sale() {
		System.out.println("��������̨ʽ��");
	}
}

class ShenzhouLeptop extends Laptop {

	@Override
	public void sale() {
		System.out.println("�������ݱʼǱ�");
	}
}

class ShenzhouPead extends Pead {

	@Override
	public void sale() {
		System.out.println("��������ƽ��");
	}
}