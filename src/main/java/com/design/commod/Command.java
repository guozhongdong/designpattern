package com.design.commod;

/**
 * @author gzd
 * @date 2019/8/9 下午12:40
 * 命令抽象类,定义抽象执行的方法
 */
public abstract  class Command {

    protected DaimaGroup daimaGroup = new DaimaGroup();

    protected RequiredGroup requiredGroup = new RequiredGroup();

    protected PageGroup pg = new PageGroup();
    /**
     *
     * 执行命令的抽象类
     * */
    public abstract void execute();
}
