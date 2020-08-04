package com.wang.chainOfResp;

public class Client {
	public static void main(String[] args) {
		Leader director = new Director("����");
		Leader manager = new Manager("����");
		Leader generalManager = new GeneralManager("����");
		
		//�����������ϵ
		director.setNextLeader(manager);
		manager.setNextLeader(generalManager);
		
		//��ʼ��ٲ���
		LeaveRequest request1 = new LeaveRequest("wangQ", 2, "���ϼ�̽��");
		director.handleRequest(request1);
	}
}
