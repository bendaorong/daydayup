package com.wugufengdeng.daydayup.designpattern.decorator;

public class Latte extends Coffee{
    @Override
    public String name() {
        return "拿铁";
    }

    @Override
    public double cost() {
        return 4;
    }
}