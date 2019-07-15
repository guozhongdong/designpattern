package com.design.proxy.statics;

/**
 * @author gzd
 * @date 2019/7/15 上午10:58
 */
public class ProxyObject implements AbstractObject {

    RealObject realObject = new RealObject();

    @Override
    public void operation(String name) {
        System.out.println("代理开始之前！！！");
        realObject.operation("静态代理");
        System.out.println("代理开始之后！！！");
    }
}
