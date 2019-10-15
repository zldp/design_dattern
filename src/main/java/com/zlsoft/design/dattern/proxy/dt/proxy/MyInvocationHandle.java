package com.zlsoft.design.dattern.proxy.dt.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author dp
 * @version 1.0.0
 * @date 2019-10-15 11:34
 */
public class MyInvocationHandle implements InvocationHandler {
    private Object target;
    public void setTarget(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        DogUtils.method1();
        method.invoke(target, args);
        DogUtils.method2();
        return null;
    }
}
