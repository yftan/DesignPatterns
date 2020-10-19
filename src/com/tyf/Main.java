package com.tyf;

import com.tyf.chainOfResposibility.*;
import com.tyf.builder.Product;
import com.tyf.decorator.CheckenHumburger;
import com.tyf.decorator.Chilli;
import com.tyf.decorator.Humburger;
import com.tyf.decorator.Lettuce;
import com.tyf.observer.User;
import com.tyf.observer.WechatServer;
import com.tyf.strategy.Context;
import com.tyf.strategy.FirstGun;
import com.tyf.strategy.SecondGun;
import com.tyf.strategy.SimpleFactoryContext;

/**
 * 设计模式测试
 * @author tyf
 */
public class Main {

    public static void main(String[] args) {
        decorator();
    }


    /**
     * 装饰者模式
     */
    public static void decorator(){
        Humburger humburger = new CheckenHumburger();
        System.out.println(humburger.getName()+"  价钱："+humburger.getPrice());
        Lettuce lettuce = new Lettuce(humburger);
        System.out.println(lettuce.getName()+"  价钱："+lettuce.getPrice());
        Chilli chilli = new Chilli(lettuce);
        System.out.println(chilli.getName()+"  价钱："+chilli.getPrice());
        Chilli chilli1 = new Chilli(chilli);
        System.out.println(chilli1.getName()+"  价钱："+chilli1.getPrice());

//        Chilli chilli2 = new Chilli(new Lettuce(new Chilli(new Lettuce(humburger))));
//        System.out.println(chilli2.getName()+"  价钱："+chilli2.getPrice());
    }

    /**
     * 责任链模式
     */
    public static void chainOfResp() {
        Leader director = new Director("部门主管");
        Leader manager = new Manager("经理");
        Leader president = new President("总经理");

        // 确定责任管理
        director.setNextLeader(manager);
        manager.setNextLeader(president);

        LeaveRequest leaveRequest = new LeaveRequest("tyf", 14, "就是想请假" );
        director.handleRequest(leaveRequest);

    }

    /**
     * 简单工厂模式+策略模式测试
     */
    public static void simpleFactroyStrategy() {
        SimpleFactoryContext simpleFactoryContext = new SimpleFactoryContext("A");
        simpleFactoryContext.gun();

        simpleFactoryContext.changeType("B");
        simpleFactoryContext.gun();
    }


    /**
     * 策略模式测试
     */
    public static void strategy() {
        FirstGun firstGun = new FirstGun();
        Context context = new Context(firstGun);
        context.gun();

        SecondGun secondGun = new SecondGun();
        context.setWeapon(secondGun);
        context.gun();
    }


    /**
     * 建造者模式测试
     */
    public static void builder () {
        Product product = new Product.Builder()
                                        .id(1)
                                        .name("tyf")
                                        .price(100000000)
                                        .type(1)
                                        .build();
        System.out.println(product.toString());

    }

    /**
     * 观察者模式测试
     */
    public static void obeserver() {
        /* ----------------观察者测试 开始 -------------------------*/
        User userTan = new User("tyf");
        User userMeng = new User("mx");
        User userYu = new User("yzq");

        WechatServer wechatServer = new WechatServer();
        wechatServer.registerObserver(userTan);
        wechatServer.registerObserver(userMeng);
        wechatServer.registerObserver(userYu);

        wechatServer.setInformation("PHP是世界上最好的语言！");

        /* ----------------观察者测试 结束 -------------------------*/
    }
}
