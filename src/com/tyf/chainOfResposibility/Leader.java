package com.tyf.chainOfResposibility;

public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader leader) {
        this.nextLeader = leader;
    }

    //对事件的处理的核心体现
    public abstract void handleRequest(LeaveRequest request);

}
