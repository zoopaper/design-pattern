package com.pattern.command.restaurant;

/**
 * 经理
 * User: shijingui
 * Date: 2016/8/9
 */
public class Manager {
    private OrderInfo orderInfo;

    public Manager(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public boolean isAgree() {
        System.out.println("同意使用优惠券...");
        return true;
    }
}
