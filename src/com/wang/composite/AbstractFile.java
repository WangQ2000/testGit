package com.wang.composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
	void killVirus();
}

class ImageFile implements AbstractFile {

	private String name;

	public ImageFile(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("----ͼ���ļ���" + name + "���в�ɱ");

	}

}

class TextFile implements AbstractFile {

	private String name;

	public TextFile(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("----�ı��ļ���" + name + "���в�ɱ");

	}

}

class VedioFile implements AbstractFile {

	private String name;

	public VedioFile(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("----��Ƶ�ļ���" + name + "���в�ɱ");

	}

}

class Folder implements AbstractFile {
	private String name;
	// ��������������ű����������µ��ӽڵ�
	private List<AbstractFile> list = new ArrayList<>();

	public Folder(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("�ļ��У�" + name + "���в�ɱ");
		for (AbstractFile file : list) {
			file.killVirus();
		}

	}

	public void add(AbstractFile file) {
		list.add(file);
	}

	public void remove(AbstractFile file) {
		list.remove(file);
	}

	public AbstractFile getChild(int index) {
		return list.get(index);
	}

}