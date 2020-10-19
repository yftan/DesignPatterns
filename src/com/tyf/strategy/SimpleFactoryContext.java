package com.tyf.strategy;

/**
 * 简单工厂模式+策略模式
 */
public class SimpleFactoryContext {
    Weapon weapon;
    // 方式changeType时多次产生未销毁内存
    FirstGun firstGun;
    SecondGun secondGun;

    public SimpleFactoryContext(String type) {
        firstGun = new FirstGun();
        secondGun = new SecondGun();
        switch (type) {
            case "A": weapon = firstGun;
                break;
            case "B": weapon = secondGun;
                break;
        }
    }

    public void changeType(String type) {
        switch (type) {
            case "A": weapon = this.firstGun;
                break;
            case "B": weapon = this.secondGun;
                break;
        }
    }

    public void gun() {
        weapon.gun();
    }
}
