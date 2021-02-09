package com.tyf.singleton;

public class Singleton {

    private static Singleton instance = new Singleton();

    // 私有化构造方法
    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

}
