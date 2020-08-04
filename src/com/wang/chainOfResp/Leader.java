package com.wang.chainOfResp;

/**
 * ������
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
	//�����������ĺ��ö���
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	//��������ĺ��ķ���
	public abstract void handleRequest(LeaveRequest request);
}
