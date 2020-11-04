package com.tyf.flyWeight.chess;

/**
 * 具体亨元类: 内部状态类（共享） 白色棋子
 */
public class WhiteIgoChessman implements IgoChessman{
    @Override
    public String getColor() {
        return "白色";
    }
}
