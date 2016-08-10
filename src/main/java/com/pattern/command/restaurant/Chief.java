package com.pattern.command.restaurant;

import java.util.Iterator;
import java.util.Map;

/**
 * 接收者角色，可以是任何一个类
 * User: shijingui
 * Date: 2016/8/4
 */
public class Chief {
    private OrderInfo orderInfo;

    public Chief(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public void prepare() {
        System.out.println("厨师接收到订单...");
        Map foodMap = orderInfo.getFoodMap();
        Iterator iterator = foodMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public void cancel() {
        System.out.println("该订单被取消了，不要在准备饭菜了...");
    }
}
