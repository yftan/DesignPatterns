package com.tyf.flyWeight.chess;

/**
 * 具体亨元类：内部状态类（共享） 黑色棋子
 */
public class BlackIgoChessman implements IgoChessman{
    @Override
    public String getColor() {
        return "黑色";
    }
}
