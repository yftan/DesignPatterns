package com.tyf.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GamePlayIH implements InvocationHandler {

    // 被代理的实例
    Object obj = null;

    // 我要代理谁
    GamePlayIH(Object _obj) {
        this.obj = _obj;
    }

    // 被代理调用的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("谭羽丰1");

        InvocationHandler handler = new GamePlayIH(player);

        ClassLoader classLoader = handler.getClass().getClassLoader();

        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, handler);

        proxy.login("tyue", "123");
        proxy.killBoss();
        proxy.upgrade();

    }
}
