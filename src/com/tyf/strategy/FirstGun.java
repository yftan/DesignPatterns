package com.tyf.strategy;

public class FirstGun implements Weapon{
    @Override
    public void gun() {
        System.out.println("使用AWM狙击步枪。");
    }
}
