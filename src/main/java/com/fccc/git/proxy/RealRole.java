package com.fccc.git.proxy;

/**
 * Created by fccc on 2019/3/27
 */
public class RealRole implements Role{
    @Override
    public void methodA() {
        System.out.println("RealRole methodA!");
    }
}
