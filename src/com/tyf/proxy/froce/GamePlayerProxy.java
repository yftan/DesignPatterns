package com.tyf.proxy.froce;

/**
 * 强制代理
 *
 * 通过真实对象获取到代理，然后在进行调用。就像找明星，明星不接单，他给你指定他到经纪人。
 *
 */
public class GamePlayerProxy implements IGamePlayer {

    private GamePlayer gamePlayer = null;
    GamePlayerProxy(GamePlayer player){
        gamePlayer = player;
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

    @Override
    public IGamePlayer getProxy(){
        return null;
    }

    public static void main(String[] args) {
        GamePlayer player = new GamePlayer("谭羽丰");
        player.upgrade();
        IGamePlayer proxy = player.getProxy();
        proxy.login("tyue","123");
        proxy.killBoss();
        // 这个地方是有缺陷的，只要proxy被创建了，player就可以正常调用
        // getProxy之后，就可以绕过代理直接调用。在代码层面，JAVA的确是这样的，个人觉得强制代理是一种“约定”，
        // 如果一个角色存在getProxy方法，那就要通过它的代理访问它的方法。
        player.upgrade();
    }
}
