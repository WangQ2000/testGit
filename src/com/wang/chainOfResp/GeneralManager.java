package com.wang.chainOfResp;

/**
 * 总经理类
 * 
 * @author wangQ
 *
 * @date 2020-8-4
 */
public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 30) {
			System.out.println(
					"员工：" + request.getEmpName() + ",请假，天数：" + request.getLeaveDays() + ",理由:" + request.getReason());
			System.out.println("总经理：" + this.name + "批准");
		} else {
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(request);
			}else {
				System.out.println("莫非员工：" + request.getEmpName() + ",想辞职既然请假" + request.getLeaveDays()+"天");
			}

		}

	}
}
