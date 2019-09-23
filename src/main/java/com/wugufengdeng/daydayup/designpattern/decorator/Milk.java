package com.wugufengdeng.daydayup.designpattern.decorator;

public class Milk extends Condiment{
    private Coffee coffee;
    public Milk(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public String name() {
        return this.coffee.name() + "+牛奶";
    }

    @Override
    public double cost() {
        return this.coffee.cost() + 0.5;
    }
}