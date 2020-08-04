package com.wang.composite;

public class Client {
	public static void main(String[] args) {
		AbstractFile f2, f3,f4,f5;

		Folder f1 = new Folder("我的收藏");
		f2 = new ImageFile("title.jpg");
		f3 = new TextFile("hello.txt");
		f1.add(f2);
		f1.add(f3);
		f2.killVirus();
		f1.killVirus();
		Folder f11 = new Folder("电影");
		f4 = new VedioFile("少年的你");
		f5 = new VedioFile("一朵小红花");
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);
		f1.killVirus();
	}
}
