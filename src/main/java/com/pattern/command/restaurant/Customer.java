package com.pattern.command.restaurant;

/**
 * 顾客
 * User: krisjin
 * Date: 2016/8/9
 */
public class Customer {
    public static void main(String[] args) {
        createOrder();
    }

    public static void createOrder() {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.addFood(1, "鱼香肉丝");
        orderInfo.addFood(2, "番茄炒蛋");
        orderInfo.addFood(3, "醋溜土豆丝");

        Command submitOrderCmd = new SubmitOrderCommand(orderInfo);
        Command couponCmd = new CouponCommand(orderInfo);
        Command cancelCmd = new CancelOrderCommand(orderInfo);

        MacroCommand macroCommand = new DefaultMacroCommand();
        macroCommand.add(submitOrderCmd);
        macroCommand.add(couponCmd);

        Waiter waiter = new Waiter();
        waiter.setCommand(macroCommand);
        waiter.action();

        waiter.setCommand(cancelCmd);
        waiter.action();
    }

}
