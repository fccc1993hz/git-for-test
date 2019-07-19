package com.fccc.git.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by fccc on 2019/3/27
 */
public class ProxyRole implements InvocationHandler {
    private Role realRole;

    ProxyRole(Role realRole) {
        super();
        this.realRole = realRole;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ProxyRole before realRole");
        Object object = method.invoke(realRole, args);
        System.out.println("ProxyRole after realRole");
        return object;
    }
}
