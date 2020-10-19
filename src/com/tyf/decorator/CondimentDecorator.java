package com.tyf.decorator;

/**
 * 配料的基类（装饰者，用来对汉堡进行多层装饰，每层装饰增加一些配料，相当于上面Decorator）
 */
public abstract class CondimentDecorator extends Humburger {
    public abstract String getName();
}
