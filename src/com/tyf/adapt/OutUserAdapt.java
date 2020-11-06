package com.tyf.adapt;

import java.util.Map;

public class OutUserAdapt extends OuterUser implements IUserInfo  {

    private Map baseInfo = super.getUserBaseInfo();
    private Map officeInfo = super.getUserOfficeInfo();
    private Map homeInfo = super.getUserHomeInfo();

    @Override
    public String getUserName() {
        return (String) baseInfo.get("userName");
    }

    @Override
    public String getHomeAddress() {
        return (String) homeInfo.get("homeAddress");
    }

    @Override
    public String getMobileNumber() {
        return (String) baseInfo.get("mobileNumber");
    }


    @Override
    public String getOfficeTelNumber() {
        return (String) officeInfo.get("officeTelNumber");
    }

    @Override
    public String getJobPostion() {
        return (String) officeInfo.get("jobPostion");
    }

    @Override
    public String getHomeTelNumber() {
        return null;
    }
}
