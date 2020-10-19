package com.tyf.decorator;

public class Chilli extends CondimentDecorator {
    Humburger humburger;

    public Chilli (Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName() + " 加辣椒";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice() + 2.0;
    }
}
