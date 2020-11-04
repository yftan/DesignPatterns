package com.tyf.proxy.froce;

public class GamePlayer implements IGamePlayer {

    private String name;

    GamePlayer(String name) {
        this.name = name;
    }

    private GamePlayerProxy gamePlayerProxy = null;

    @Override
    public void login(String username, String password) {
        if (this.isProxy()) {
            System.out.println("用户名" + username + "的用户" + this.name + "登录了");
        } else {
            System.out.println("请找我的经纪人");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy() ) {
            System.out.println("用户" + this.name + "在打Boss了");
        } else {
            System.out.println("请找我的经纪人");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy() ) {
            System.out.println("用户" + this.name + "升级了");
        } else {
            System.out.println("请找我的经纪人");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        if (gamePlayerProxy == null) {
            gamePlayerProxy = new GamePlayerProxy(this);
            return gamePlayerProxy;
        }
        return gamePlayerProxy;
    }

    private boolean isProxy(){
        if (gamePlayerProxy == null) {
            return false;
        }
        return true;
    }
}
