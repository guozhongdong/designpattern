package com.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author gzd
 * @date 2019/7/15 上午11:14
 */
public class DynamicProxy implements InvocationHandler {

    private Object realObject ;

    public  Object newInstance(Object realObject){

        this.realObject = realObject;
        System.out.println(realObject.getClass().getClassLoader());
        System.out.println(realObject.getClass().getInterfaces());
        return Proxy.newProxyInstance(realObject.getClass().getClassLoader(),realObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start >>>>>>");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        Object ref = null;
        try {
            ref = method.invoke(realObject,args);
            System.out.println("success!!!");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("error>>>>>>'");
            throw e;
        }

        return ref;
    }
}
