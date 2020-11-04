package com.tyf.proxy.froce;

public interface IGamePlayer {
    void login(String username, String password);

    void killBoss();

    void upgrade();

    IGamePlayer getProxy();

}
