package com.pattern.command.restaurant;

/**
 * 服务生（请求者负责调用命令对象）
 * User: shijingui
 * Date: 2016/8/4
 */
public class Waiter {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }

}
