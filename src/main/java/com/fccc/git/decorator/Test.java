package com.fccc.git.decorator;

/**
 * Created by fccc on 2019/7/23
 */
public class Test {
    public static void main(String[] args) {
        Coffee coffee = new Soy(new Mocha(new Espresso()));
        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        Coffee coffee1 = new Mocha(new HouseBlend());
        System.out.println(coffee1.getName());
        System.out.println(coffee1.getPrice());
    }
}
