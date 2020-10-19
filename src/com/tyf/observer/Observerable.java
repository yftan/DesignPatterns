package com.tyf.observer;

/**
 * 抽象被观察者接口
 * 声明添加、删除、通知观察者
 * 参考地址：https://www.cnblogs.com/luohanguo/p/7825656.html
 */
public interface Observerable {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();

}
