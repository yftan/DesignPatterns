package com.tyf.chainOfResposibility;

public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        int days = request.getLeaveDays();
        String name = request.getName();
        String reason = request.getReason();

        if(days <= 3) {
            System.out.println("员工" + name + "请假" + days + "天，理由：" + reason);
            System.out.println("主任" + this.name + "审批通过");
        } else {
            System.out.println("请假天数过多，主任" + this.name + "没法处理");
            if(this.nextLeader != null ) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
