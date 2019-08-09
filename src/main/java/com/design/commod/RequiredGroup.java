package com.design.commod;

/**
 * @author gzd
 * @date 2019/8/9 下午12:43
 */
public class RequiredGroup extends Group {

    @Override
    public void find() {
        System.out.println("查找需求的执行者！！");
    }

    @Override
    public void add() {
        System.out.println("增加一个需求！！！");
    }

    @Override
    public void delete() {
        System.out.println("删除一个需求！！");
    }

    @Override
    public void change() {
        System.out.println("修改一个需求！！");
    }

    @Override
    public void plan() {
        System.out.println("执行一个需求计划！！！");
    }
}
