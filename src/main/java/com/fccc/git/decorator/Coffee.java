package com.fccc.git.decorator;

/**
 * Created by fccc on 2019/7/23
 */
public abstract class Coffee {
    String name = "Coffee";

    public String getName() {
        return name;
    }

    public abstract double getPrice();
}
