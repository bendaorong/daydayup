package com.wugufengdeng.daydayup.designpattern.decorator;

public class Sugar extends Condiment{
    private Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public String name() {
        return coffee.name() + "+糖";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.2;
    }
}