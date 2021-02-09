package com.tyf.singleton;

public class Singleton1 {

    private volatile static Singleton1 instance = null;

    // 私有化构造方法
    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton1();
                }
            }

        }
        return instance;
    }


}
