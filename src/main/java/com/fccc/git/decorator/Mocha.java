package com.fccc.git.decorator;

/**
 * Created by fccc on 2019/7/23
 */
public class Mocha extends Flavour {
    private Coffee coffee;
    private double price;

    public Mocha(Coffee coffee) {
        this.coffee = coffee;
        name = "Mocha";
        price = 1.5f;
    }

    @Override
    public String getName() {
        return name + "\t" + coffee.getName();
    }

    @Override
    public double getPrice() {
        return price + coffee.getPrice();
    }
}
