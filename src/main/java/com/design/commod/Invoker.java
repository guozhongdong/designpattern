package com.design.commod;

/**
 * @author gzd
 * @date 2019/8/9 下午12:43
 * 真正的执行类
 */
public class Invoker {

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    private Command command;



    public void action(){
        command.execute();
    }
}
