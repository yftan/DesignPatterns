package com.tyf.proxy.general;

public class GamePlayer implements IGamePlayer {

    private String name;

    // 构造函数限制只有代理才能创建对象，并同时传递姓名
    GamePlayer(IGamePlayer _gamePlayer,  String name){
        if (_gamePlayer == null) {
            throw new RuntimeException("不能创建新对象");
        } else {
            this.name = name;
        }
    }

    @Override
    public void login(String username, String password) {
        System.out.println("用户名" + username + "的用户" + this.name + "登录了");
    }

    @Override
    public void killBoss() {
        System.out.println("用户" + this.name + "在打Boss了");
    }

    @Override
    public void upgrade() {
        System.out.println("用户" + this.name + "升级了");
    }
}
