package com.tyf.decorator;

public class CheckenHumburger extends Humburger {

    public CheckenHumburger(){
        name = "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
