package com.wugufengdeng.daydayup.designpattern.decorator;

public class Espresso extends Coffee{
    @Override
    public String name() {
        return "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 1;
    }
}