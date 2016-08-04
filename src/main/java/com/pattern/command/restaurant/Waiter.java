package com.pattern.command.restaurant;

/**
 * 服务生（请求者负责调用命令对象），获取客户选好菜的订单，执行下单动作。
 * User: shijingui
 * Date: 2016/8/4
 */
public class Waiter {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void orderUp() {
        command.execute();
    }


}
