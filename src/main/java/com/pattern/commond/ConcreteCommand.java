package com.pattern.commond;

/**
 * User: shijingui
 * Date: 2016/8/2
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        receiver.action();
    }
}
