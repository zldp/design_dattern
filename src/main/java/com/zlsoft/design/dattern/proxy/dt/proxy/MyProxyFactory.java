package com.zlsoft.design.dattern.proxy.dt.proxy;

import java.lang.reflect.Proxy;

/**
 * 生产代理对象工厂
 * @author dp
 * @version 1.0.0
 * @date 2019-10-15 11:36
 */
public class MyProxyFactory {
    public static Object getProxy(Object target) {
        MyInvocationHandle handle = new MyInvocationHandle();
        handle.setTarget(target);
        // newProxyInstance，方法有三个参数： loader: 用哪个类加载器去加载代理对象  interfaces:动态代理类需要实现的接口 h:动态代理方法在执行时，会调用h里面的invoke方法去执行
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handle);
        return proxy;
    }


}
