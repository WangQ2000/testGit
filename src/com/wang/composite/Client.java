package com.wang.composite;

public class Client {
	public static void main(String[] args) {
		AbstractFile f2, f3,f4,f5;

		Folder f1 = new Folder("�ҵ��ղ�");
		f2 = new ImageFile("title.jpg");
		f3 = new TextFile("hello.txt");
		f1.add(f2);
		f1.add(f3);
		f2.killVirus();
		f1.killVirus();
		Folder f11 = new Folder("��Ӱ");
		f4 = new VedioFile("�������");
		f5 = new VedioFile("һ��С�컨");
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);
		f1.killVirus();
	}
}
