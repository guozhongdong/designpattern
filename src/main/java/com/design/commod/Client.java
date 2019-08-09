package com.design.commod;

/**
 * @author gzd
 * @date 2019/8/9 下午1:43
 */
public class Client {

    public static void main(String[] args) {
        // 执行删除一个页面
        Invoker invoker = new Invoker();
        PageDeleteCommand deleteCommand = new PageDeleteCommand();
        invoker.setCommand(deleteCommand);
        invoker.action();
    }
}
