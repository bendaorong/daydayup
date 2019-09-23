package com.wugufengdeng.daydayup.designpattern.decorator;

public class FlatWhite extends Coffee{
    @Override
    public String name() {
        return "白咖啡";
    }

    @Override
    public double cost() {
        return 3;
    }
}