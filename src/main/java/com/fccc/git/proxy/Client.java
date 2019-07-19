package com.fccc.git.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by fccc on 2019/3/27
 */
public class Client {
    public static void main(String[] args) {
        Role realRole = new RealRole();
        InvocationHandler handler = new ProxyRole(realRole);

        Role role = (Role) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realRole.getClass().getInterfaces(), handler);
        System.out.println(role.getClass().getName());
        role.methodA();
    }
}
