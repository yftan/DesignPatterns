package com.tyf.decorator;

/**
 * 装饰者模式：例子有汉堡基类，配料基类
 *
 * 汉堡基类
 *
 * 参考地址：https://blog.csdn.net/jason0539/article/details/22713711
 */
public abstract class Humburger {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract double getPrice();
}
