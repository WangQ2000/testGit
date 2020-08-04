package com.wang.chainOfResp;

/**
 * ������
 * 
 * @author wangQ
 *
 * @date 2020-8-4
 */
public class Director extends Leader {

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 3) {
			System.out.println(
					"Ա����" + request.getEmpName() + ",��٣�������" + request.getLeaveDays() + ",����:" + request.getReason());
			System.out.println("���Σ�" + this.name + "��׼");
		} else {
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(request);
			}else {
				System.out.println("Ī��Ա����" + request.getEmpName() + ",���ְ��Ȼ���" + request.getLeaveDays()+"��");
			}

		}

	}
}
