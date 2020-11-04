package com.tyf.flyWeight.signinfo;

/**
 * 报考信息
 */
public class SignInfo {
    /**
     * 报名人ID
     */
    String id;

    /**
     * 考试地点
     */
    String location;

    /**
     * 考试科目
     */
    String subject;

    /**
     * 邮寄地址
     */
    String postAddr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPostAddr() {
        return postAddr;
    }

    public void setPostAddr(String postAddr) {
        this.postAddr = postAddr;
    }
}
