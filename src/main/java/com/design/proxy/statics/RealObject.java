package com.design.proxy.statics;

/**
 * @author gzd
 * @date 2019/7/15 上午10:57
 * 源目标类
 */
public class RealObject implements AbstractObject{

    @Override
    public void operation(String name) {
        System.out.println("real operation!!!"+name);
    }
}
