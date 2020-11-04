package com.tyf.flyWeight.signinfo;

import java.util.HashMap;

/**
 * 参考地址：https://blog.csdn.net/wwwdc1012/article/details/82833965
 *
 */
public class SignInfoFactory {

    private static HashMap<String, SignInfo> pool = new HashMap<>();

    /**
     * 不用享元模式，通过工厂类获取
     *
     * @return
     */
    @Deprecated
    public static SignInfo getSignInfo(){
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key){
        // 设置返回对象
        SignInfo signInfo = null;
        // 池中没有对象，则建立，并放入池中
        if(!pool.containsKey(key)){
            System.out.println("建立对象，并放入池中");
            // signInfo = new SignInfo(); 这样页可以。不知掉为什么要用这个SignInfoPool
            signInfo = new SignInfoPool(key);
            pool.put(key, signInfo);
        } else {
            System.out.println("直接从池中获取");
            signInfo = pool.get(key);
        }
        return signInfo;
    }


}
