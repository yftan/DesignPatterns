package com.tyf.chainOfResposibility;

public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        int days = request.getLeaveDays();
        String name = request.getName();
        String reason = request.getReason();

        if(days <= 11) {
            System.out.println("员工"+name+"请假"+days+"天，理由是"+reason);
            System.out.println("经理"+this.name+"审批通过");
        } else {
            System.out.println("请假天数过多，经理"+this.name+"没法处理");
            if(this.nextLeader != null ) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
