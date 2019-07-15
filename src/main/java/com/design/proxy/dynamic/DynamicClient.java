package com.design.proxy.dynamic;

import com.design.proxy.statics.AbstractObject;
import com.design.proxy.statics.RealObject;

/**
 * @author gzd
 * @date 2019/7/15 下午1:53
 */
public class DynamicClient {

    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy();
        AbstractObject abstractObject = (AbstractObject) dynamicProxy.newInstance(new RealObject());
        abstractObject.operation("动态代理！！");
    }
}
