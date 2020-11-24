package com.pattern.command.restaurant;

/**
 * 下单命令操作
 * User: krisjin
 * Date: 2016/8/4
 */
public class SubmitOrderCommand implements Command {

    private Chief chief;

    public SubmitOrderCommand(OrderInfo orderInfo) {
        chief = new Chief(orderInfo);
    }

    @Override
    public void execute() {
        chief.prepare();
    }
}
