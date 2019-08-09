package com.design.commod;

/**
 * @author gzd
 * @date 2019/8/9 下午12:43
 */
public class DaimaGroup extends Group {

    @Override
    public void find() {
        System.out.println("我是代码的执行者！！");
    }

    @Override
    public void add() {
        System.out.println("增加一段代码！！");
    }

    @Override
    public void delete() {
        System.out.println("删除一段代码！！");
    }

    @Override
    public void change() {
        System.out.println("修改一段代码！！");
    }

    @Override
    public void plan() {
        System.out.println("计划一段代码！！");
    }
}
