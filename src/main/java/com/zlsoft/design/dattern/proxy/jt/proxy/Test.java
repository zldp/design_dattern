package com.zlsoft.design.dattern.proxy.jt.proxy;

/**
 * @author dp
 * @version 1.0.0
 * @date 2019-10-15 11:29
 */
public class Test {
    /**
     * 静态代理总结:
     * 优点：可以做到在不修改目标对象的功能前提下,对目标功能扩展.
     * 缺点:
     *
     * 　　因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
     *
     * 而动态代理方式可以解决上面的问题
     * @param args
     */
    public static void main(String[] args) {
        IStar iStar = new LDHStar();
        ProxyManger proxyManger = new ProxyManger(iStar);
        proxyManger.sing();
    }
}
