package com.fccc.git.decorator;

/**
 * Created by fccc on 2019/7/23
 */
public class HouseBlend extends Coffee {
    private double price;

    public HouseBlend() {
        name = "HouseBlend";
        price = 15.5f;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
