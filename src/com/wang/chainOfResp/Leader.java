package com.wang.chainOfResp;

/**
 * 抽象类
 * 
 * @author wangQ
 *
 * @date 2020-8-4
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader;

	public Leader(String name) {
		super();
		this.name = name;
	}
	//设置责任链的后置对象
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	//处理请求的核心方法
	public abstract void handleRequest(LeaveRequest request);
}
