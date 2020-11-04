package com.tyf.flyWeight.chess;

/**
 * 抽象亨元接口
 */
public interface IgoChessman {
    public abstract String getColor();

    public default void display(Coordinates coordinates) {
        System.out.println("棋子颜色：" + this.getColor() + ",棋子位置：" + coordinates);
    }
}
