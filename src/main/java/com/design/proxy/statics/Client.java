package com.design.proxy.statics;

/**
 * @author gzd
 * @date 2019/7/15 上午11:00
 */
public class Client {

    public static void main(String[] args) {
        ProxyObject proxyObject = new ProxyObject();
        proxyObject.operation("静态");
    }
}
