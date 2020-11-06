package com.tyf.adapt;

import java.util.Map;

public interface IOuterUser {

    /**
     *  基本信息，比如：名称、性别手机号码等
     */
    public Map getUserBaseInfo();

    /**
     *  工作区域信息
     */
    public Map getUserOfficeInfo();

    /**
     *  员工家庭信息
     */
    public Map getUserHomeInfo();
}
