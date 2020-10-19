package com.tyf.decorator;

public class Lettuce extends CondimentDecorator {
    Humburger humburger;

    public Lettuce(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName() + " 加生菜";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice() + 1.5;
    }
}
