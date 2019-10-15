package com.zlsoft.design.dattern.proxy.jt.proxy;

/**
 * @author dp
 * @version 1.0.0
 * @date 2019-10-15 11:26
 */
public class ProxyManger implements IStar {
    private IStar iStar;

    public ProxyManger() {
        super();
    }
    public ProxyManger(IStar iStar) {
        super();
        this.iStar = iStar;
    }

    @Override
    public void sing() {
        System.out.println("唱歌前做准备。。。。。");
        iStar.sing();
        System.out.println("善后工作");
    }
}
