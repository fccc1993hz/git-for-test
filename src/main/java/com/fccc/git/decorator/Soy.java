package com.fccc.git.decorator;

/**
 * Created by fccc on 2019/7/23
 */
public class Soy extends Flavour {
    private Coffee coffee;
    private double price;

    public Soy(Coffee coffee) {
        this.coffee = coffee;
        name = "Soy";
        price = 2.5f;
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
