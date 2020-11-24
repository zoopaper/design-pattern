package com.pattern.command;

/**
 * 请求者角色
 * 负责调用命令对象执行请求，相关的方法叫做行动方法
 * User: krisjin
 * Date: 2016/8/2
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 命令执行动作方法
     */
    public void action() {
        command.execute();
    }
}
