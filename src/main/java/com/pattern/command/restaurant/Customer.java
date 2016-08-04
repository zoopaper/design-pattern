package com.pattern.command.restaurant;

/**
 * User: shijingui
 * Date: 2016/8/4
 */
public class Customer {

    public static void main(String[] args) {
        Order order = new Order();
        order.addFood(1, "鱼香肉丝");
        order.addFood(2, "番茄炒蛋");
        order.addFood(3, "苏留土豆丝");

        Command command = new OrderCommand(order);

        Waiter waiter = new Waiter();
        waiter.setCommand(command);
        waiter.orderUp();
    }

}
