package com.design.commod;

/**
 * @author gzd
 * @date 2019/8/9 下午12:42
 */
public class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("查找页面的执行者！！");
    }

    @Override
    public void add() {
        System.out.println("增加一个页面！！");
    }

    @Override
    public void delete() {
        System.out.println("删除一个页面！！");
    }

    @Override
    public void change() {
        System.out.println("修改页面！！");
    }

    @Override
    public void plan() {
        System.out.println("计划页面！！");
    }
}
