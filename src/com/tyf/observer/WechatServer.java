package com.tyf.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，也就是微信公众号服务
 * 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 *
 */
public class WechatServer implements Observerable {

    // 记录所有要通知的人
    // list，设计原则：面向接口编程而不是面向实现编程
    private List<Observer> list;
    private String message;

    public WechatServer() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(o != null)
            list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : list ) {
            o.update(message);
        }
    }

    public void setInformation(String msg) {
        this.message = msg;
        System.out.println("微信服务更新消息： " + msg);
        notifyObserver();
    }
}
