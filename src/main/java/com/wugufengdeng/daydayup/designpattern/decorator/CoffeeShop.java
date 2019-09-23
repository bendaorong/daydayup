package com.wugufengdeng.daydayup.designpattern.decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee latte = new Latte();
        System.out.println(latte.name()+":"+latte.cost());

        Coffee myCoffee = new Latte();
        myCoffee = new Milk(myCoffee);
        myCoffee = new Sugar(myCoffee);
        System.out.println(myCoffee.name()+":"+myCoffee.cost());
    }
}