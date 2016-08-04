package com.pattern.command.restaurant;

/**
 * User: shijingui
 * Date: 2016/8/4
 */
public class OrderCommand implements Command {

    private Chief chief;

    public OrderCommand(Order order) {
        chief = new Chief(order);
    }

    @Override
    public void execute() {
        chief.cooking();
    }
}
