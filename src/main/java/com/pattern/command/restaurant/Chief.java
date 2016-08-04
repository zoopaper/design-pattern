package com.pattern.command.restaurant;

import java.util.Iterator;
import java.util.Map;

/**
 * User: shijingui
 * Date: 2016/8/4
 */
public class Chief {
    private Order order;

    public Chief(Order order) {
        this.order = order;
    }

    public void cooking() {
        System.out.println("厨师接收到订单...");
        Map foodMap = order.getFoodMap();
        Iterator iterator = foodMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }
}
