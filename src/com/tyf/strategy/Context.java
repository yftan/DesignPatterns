package com.tyf.strategy;

public class Context {
    Weapon weapon;

    public Context(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void gun() {
        weapon.gun();
    }
}
