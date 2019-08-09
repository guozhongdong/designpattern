package com.design.commod;

/**
 * @author gzd
 * @date 2019/8/9 下午1:37
 */
public class PageDeleteCommand extends Command{


    @Override
    public void execute() {
        super.pg.plan();
        super.pg.find();
        super.pg.delete();

    }
}
