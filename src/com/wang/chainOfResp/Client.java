package com.wang.chainOfResp;

public class Client {
	public static void main(String[] args) {
		Leader director = new Director("张三");
		Leader manager = new Manager("李四");
		Leader generalManager = new GeneralManager("王五");
		
		//添加责任链关系
		director.setNextLeader(manager);
		manager.setNextLeader(generalManager);
		
		//开始请假操作
		LeaveRequest request1 = new LeaveRequest("wangQ", 2, "回老家探亲");
		director.handleRequest(request1);
	}
}
