package com.zlsoft.design.dattern.proxy.dt.proxy;

/**
 * @author dp
 * @version 1.0.0
 * @date 2019-10-15 11:39
 */
public class Test {
    /**
     * 总结：
     *
     * 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能使用动态代理，因此这也算是这种方式的缺陷。
     * @param args
     */
    public static void main(String[] args) {
        IDog dog = new RunDog();
        IDog proxy =(IDog) MyProxyFactory.getProxy(dog);
        proxy.run();
    }
}
