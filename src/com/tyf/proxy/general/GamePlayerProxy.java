package com.tyf.proxy.general;

/**
 * 普通代理
 *
 * 通过代理才能创建真实的对象，并进行调用。用户不需要知道真实对象，只通过代理对象即可。
 *
 */
public class GamePlayerProxy implements IGamePlayer{

    private GamePlayer gamePlayer = null;
    GamePlayerProxy(String name){
        gamePlayer = new GamePlayer(this, name);
    }


    @Override
    public void login(String username, String password) {
        this.gamePlayer.login(username, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    public static void main(String[] args) {
        GamePlayerProxy tyf = new GamePlayerProxy("谭羽丰");
        tyf.login("tyue","123");
        tyf.killBoss();
        tyf.upgrade();
    }
}
