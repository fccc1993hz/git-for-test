package com.fccc.git.decorator;

/**
 * Created by fccc on 2019/7/23
 */
public class Espresso extends Coffee {
    private double price;

    public Espresso() {
        name = "Espresso";
        price = 12.5f;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
