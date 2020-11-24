package com.pattern.command.restaurant;

/**
 * 取消下单
 * User: krisjin
 * Date: 2016/8/9
 */
public class CancelOrderCommand implements Command {
    private Chief chief;

    public CancelOrderCommand(OrderInfo orderInfo) {
        chief = new Chief(orderInfo);
    }

    @Override
    public void execute() {
        chief.cancel();
    }
}
