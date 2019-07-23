package com.fccc.git.decorator;

/**
 * Created by fccc on 2019/7/23
 */
public abstract class Flavour extends Coffee {
    protected Coffee coffee;

    protected Flavour(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract double getPrice();
}
