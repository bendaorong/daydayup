package com.wugufengdeng.daydayup.designpattern.decorator;

public class EspressoMacchiato extends Coffee{
    @Override
    public String name() {
        return "玛奇朵";
    }

    @Override
    public double cost() {
        return 2;
    }
}