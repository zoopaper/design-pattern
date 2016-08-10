package com.pattern.command.restaurant;

/**
 * 优惠券命令
 * User: shijingui
 * Date: 2016/8/9
 */
public class CouponCommand implements Command {
    private Manager manager;

    public CouponCommand(OrderInfo orderInfo) {
        manager = new Manager(orderInfo);
    }

    @Override
    public void execute() {
        manager.isAgree();
    }
}
